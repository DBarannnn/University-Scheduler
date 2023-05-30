package com.project.schedulerapp.Values;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
public class GroupStudentId implements Serializable {
    private Integer group_id;
    private Integer student_id;
}
