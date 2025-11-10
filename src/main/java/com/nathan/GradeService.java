package com.nathan;

import java.time.Instant;

import static java.util.spi.ToolProvider.findFirst;

public class GradeService {



    double getExamGrade(Exam exam, Student student, Instant t){
         Grade thisStudentGrade = exam.getGrades().stream()
                 .filter(grade -> grade.getStudent().getId() == student.getId())
                 .findFirst().get();
        return thisStudentGrade.getGradeAtInstant(t);
    }

}
