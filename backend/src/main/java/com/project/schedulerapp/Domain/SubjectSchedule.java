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
    @GeneratedValue
    private Long id;

    @Column
    private LocalTime startTime;

    @Column
    private LocalTime endTime;

    @Column
    private Boolean isOdd;

    @Enumerated(value = EnumType.STRING)
    private Day day;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
