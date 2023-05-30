package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.FullName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private FullName fullName;

    @Column(nullable = false)
    private Date birthday;

    @Column
    private String creditNumber;

    @Column
    private Boolean hasScholarship;

    @Column
    private String email;

    @Column
    private String password;


}
