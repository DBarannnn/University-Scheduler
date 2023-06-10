package com.project.schedulerapp.Controller;

import com.project.schedulerapp.Domain.Student;
import com.project.schedulerapp.Repository.StudentRepository;
import com.project.schedulerapp.Service.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RegistrationController {
    private final StudentRepository studentRepository;
    private final StudentService studentService;

    @PostMapping("/register")
    public Student register(@RequestBody Student student){
        return studentService.register(student);
    }

}
