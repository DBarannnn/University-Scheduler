package com.project.schedulerapp.Controller;

import com.project.schedulerapp.Domain.Student;
import com.project.schedulerapp.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final StudentRepository studentRepository;

    @GetMapping("/home")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
