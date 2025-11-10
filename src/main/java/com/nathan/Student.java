package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class Student {
    private final int id;
    private final String firstName;
    private final String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private String group;
    //private Tutor tutor;
}
