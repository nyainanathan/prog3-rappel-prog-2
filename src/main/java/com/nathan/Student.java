package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Student extends Person{
    private String group;

    public Student(int id, String firstName, String lastName, LocalDate dateOfBirth, String email, String phoneNumber, String group) {
        super(id, firstName, lastName, dateOfBirth, email, phoneNumber);
        this.group = group;
    }
    //private Tutor tutor;
}
