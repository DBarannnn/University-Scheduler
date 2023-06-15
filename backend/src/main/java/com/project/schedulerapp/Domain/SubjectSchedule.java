package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.Day;
import com.project.schedulerapp.Values.GroupSubjectId;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
@Table(name = "subject_schedule")
public class SubjectSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column(nullable = false)
    private Boolean isOdd;

    @Enumerated(value = EnumType.STRING)
    private Day day;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

}
