package com.nathan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
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
        Instant theInstant = null;
        for(int i = 0 ; i < instants.length ; i++){
            if(instants[i].isBefore(instant) && instants[i+1].isAfter(instant)){
                theInstant = instants[i];
            }
            if(i == instants.length - 1 &&  theInstant == null ){
                theInstant = instants[i];
            }
        }
        return this.grades.get(theInstant);
    }
}