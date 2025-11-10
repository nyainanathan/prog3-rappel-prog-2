package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Exam {
    private int id;
    private Course course;
    private LocalDateTime  date;
    private int coefficient;
}
