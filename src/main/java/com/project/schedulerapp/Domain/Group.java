package com.project.schedulerapp.Domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "study_group")
public class Group {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer semester;

    @OneToOne
    private Student headman;

    @ManyToMany
    @JoinTable(
            name = "group_student",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    private void addStudent(Student student){
        students.add(student);
    }

    @OneToMany(mappedBy = "group")
    private List<Event> events;

    private void addEvent(Event event){
        events.add(event);
    }
}
