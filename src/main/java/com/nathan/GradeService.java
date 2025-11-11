package com.nathan;

import java.time.Instant;

public class GradeService {

    double getExamGrade(Exam exam, Student student, Instant t){
         Grade thisStudentGrade = exam.getGrades().stream()
                 .filter(grade -> grade.getStudent().getId() == student.getId())
                 .findFirst().get();
        return thisStudentGrade.getGradeAtInstant(t);
    }


    double getCourseGrade(Course course, Student student, Instant t){
            Instant examInstant = null;
            Instant[] getExamsInstant = course.getExams().toArray(Instant[]::new);
            for(int i = 0 ; i < getExamsInstant.length; i++){
                if(i < getExamsInstant.length - 1 && getExamsInstant[i].isBefore(t) && getExamsInstant[i+1].isAfter(t)){
                    examInstant = getExamsInstant[i];
                    break;
                }
                if(i == getExamsInstant.length - 1 && getExamsInstant[i].isBefore(t) && examInstant == null ){
                    examInstant = getExamsInstant[i];
                }
            }
        Instant finalExamInstant = examInstant;
        Exam examAtInstantT = course.getExams().stream()
                    .filter(exam -> exam.getDate() == finalExamInstant)
                    .findFirst().get();
            return getExamGrade(examAtInstantT, student, t);
    }
}
