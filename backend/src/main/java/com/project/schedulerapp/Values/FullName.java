package com.project.schedulerapp.Values;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class FullName {
    private String firstName;

    private String lastName;

    private String patronymic;
}
