package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
    private ArrayList<Exam> exams;
}
