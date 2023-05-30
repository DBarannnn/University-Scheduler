package com.project.schedulerapp.Domain;

import com.project.schedulerapp.Values.GroupStudentId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "group_student")
public class GroupStudent {
    @EmbeddedId
    private GroupStudentId id;
}
