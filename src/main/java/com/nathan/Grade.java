package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class Grade {
    private Student student;
    private Course course;
    private Map<Instant, Double> grades;
    private Map<Instant, Double> gradesJustification;
    private Exam  exam;

    double getGradeAtInstant(Instant instant) {
        Instant[] instants = grades.keySet().toArray(new Instant[0]);
        return this.grades.get(InstantUtils.getClosestInstant(instants, instant));
    }
}
