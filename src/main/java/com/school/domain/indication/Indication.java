package com.school.domain.indication;

import com.school.domain.student.Student;
import java.time.LocalDateTime;

public class Indication {

    private Student indicated;
    private Student indicatedStudent;
    private LocalDateTime startTime;

    public Indication(Student indicated, Student indicatedStudent) {
        this.indicated = indicated;
        this.indicatedStudent = indicatedStudent;
        this.startTime = LocalDateTime.now();
    }

    public Student getIndicated() {
        return indicated;
    }

    public Student getIndicatedStudent() {
        return indicatedStudent;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

}
