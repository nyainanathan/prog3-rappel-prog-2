package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Grade {
    private Student student;
    private Course course;
    private int grade;
    private Exam  exam;
}