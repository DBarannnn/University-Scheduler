package com.project.schedulerapp.Configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityFilterChainConfig {

    private final AuthenticationProvider authenticationProvider;

   @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       http
               .csrf().disable()
               .authorizeHttpRequests()
               .requestMatchers("/register").permitAll()
               .anyRequest().authenticated()
               .and()
               .authenticationProvider(authenticationProvider)
               .formLogin(Customizer.withDefaults())
               .oauth2Login();
       return http.build();
   }
}
