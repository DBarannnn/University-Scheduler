package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.FullName;
import com.project.schedulerapp.Values.Position;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private FullName fullName;

    @Enumerated(EnumType.STRING)
    private Position position;

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

    @ManyToMany
    @JoinTable(
            name = "group_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private List<Group> groups;

}
