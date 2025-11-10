package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;

@AllArgsConstructor
@Getter
@Setter
public class Exam {
    private ArrayList<Grade> grades;
    private int id;
    private Course course;
    private Instant date;
    private int coefficient;
}
