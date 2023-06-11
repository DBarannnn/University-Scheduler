package com.project.schedulerapp.Configuration;

import com.project.schedulerapp.Service.CustomOidcUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityFilterChainConfig  {

    private final AuthenticationProvider authenticationProvider;
    private final CustomOidcUserService customOidcUserService;

   @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       http
               .csrf(AbstractHttpConfigurer::disable)
               .authorizeHttpRequests(matcher ->
                       matcher.requestMatchers("/register").permitAll()
                               .anyRequest().permitAll())
               .authenticationProvider(authenticationProvider)
               .formLogin(Customizer.withDefaults())
               .oauth2Login(c -> c.userInfoEndpoint(e -> e.oidcUserService(customOidcUserService)));


       return http.build();
   }
}
