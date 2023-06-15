package com.project.schedulerapp.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String teacherName;

    @OneToMany(mappedBy = "subject")
    private List<Event> events;

    @OneToMany(mappedBy = "subject")
    private List<SubjectSchedule> subjectSchedules;

    @ManyToMany(mappedBy = "subjects")
    private List<Group> groups;

}
