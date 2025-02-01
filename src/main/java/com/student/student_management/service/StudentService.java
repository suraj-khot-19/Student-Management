package com.student.student_management.service;

import com.student.student_management.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //service for getStudent Controller method
    public Student getStudent() {
        return new Student("Suraj","Khot");
    }
}
