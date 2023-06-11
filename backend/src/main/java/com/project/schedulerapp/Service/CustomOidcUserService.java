package com.project.schedulerapp.Service;

import com.project.schedulerapp.Domain.Student;
import com.project.schedulerapp.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class CustomOidcUserService extends OidcUserService {
    private final StudentRepository studentRepository;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        OidcUser oidcUser = super.loadUser(userRequest);
        return processOidcUser(oidcUser);
    }

    private OidcUser processOidcUser(OidcUser oidcUser) {
        Student studentByEmail = studentRepository.getStudentByEmail(oidcUser.getEmail());
        if(studentByEmail == null){
            Student student = new Student();
            student.setEmail(oidcUser.getEmail());
            student.setFirstName(oidcUser.getGivenName());
            student.setLastName(oidcUser.getFamilyName());
            studentRepository.save(student);
        }
        return oidcUser;

    }


}
