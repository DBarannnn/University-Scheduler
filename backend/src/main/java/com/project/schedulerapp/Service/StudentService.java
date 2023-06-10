package com.project.schedulerapp.Service;

import com.project.schedulerapp.Domain.Student;
import com.project.schedulerapp.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;


    //Also should implement validation if email is not already in use
    public Student register(Student student){
        log.info("STUDENT SERVICE REGISTRATION: Object recieved is " + student.toString()   );
        String encodedPassword = passwordEncoder.encode(student.getPassword());
        student.setPassword(encodedPassword);
        return studentRepository.save(student);
    }

}
