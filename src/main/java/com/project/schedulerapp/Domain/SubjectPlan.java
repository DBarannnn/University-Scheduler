package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.GroupSubjectId;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "subject_group")
public class SubjectPlan {
    @EmbeddedId
    private GroupSubjectId groupSubjectId;

    @Column
    private Integer numberLabs;

    @Column
    private Integer credits;

    @Column
    private LocalDateTime examDate;

    @Column
    private LocalDateTime comissionDate;
}
