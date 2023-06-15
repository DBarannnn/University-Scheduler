package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.Type;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @Column(nullable = false)
    private String description;

    @Column
    private LocalDateTime startTime;

    @Column
    private LocalDateTime endTime;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

}
