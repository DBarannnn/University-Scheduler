package com.project.schedulerapp.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Year;
import java.util.List;

@Data
@Entity
@Table(name = "_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Year year;

    @ManyToMany(mappedBy = "groups")
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "headman_id")
    private Student headMan;

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
