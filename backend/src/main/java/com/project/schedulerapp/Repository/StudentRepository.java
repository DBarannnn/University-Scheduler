package com.project.schedulerapp.Repository;

import com.project.schedulerapp.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student getStudentByEmail(String email);
}
