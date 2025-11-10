package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher teacher;
}
