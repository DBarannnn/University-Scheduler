package com.project.schedulerapp.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "_group")
public class Group {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer semester;


    @ManyToMany(mappedBy = "groups")
    private List<Student> students;

    @ManyToMany
    @JoinTable(
            name = "subject_group",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

    @OneToMany(mappedBy = "group")
    private List<SubjectSchedule> subjectSchedules;

    @OneToMany(mappedBy = "group")
    private List<Event> events;

}
