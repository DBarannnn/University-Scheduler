package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.GroupSubjectId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "subject_plan")
public class SubjectPlan {
    @EmbeddedId
    private GroupSubjectId groupSubjectId;

    private Integer number_labs;

    private Integer credits;

    private LocalDateTime examDate;

    private LocalDateTime comissionDate;
}
