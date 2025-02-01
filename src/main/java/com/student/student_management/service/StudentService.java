package com.student.student_management.service;

import com.student.student_management.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    //service for getStudent Controller method
    public Student getStudent() {
        return new Student("Suraj","Khot");
    }

    public List<Student> getAllStudents() {
        List<Student> list=new ArrayList<>();

        list.add(new Student("Suraj","Khot"));
        list.add(new Student("Sanjay","Khot"));
        list.add(new Student("Santosh", "Khot"));

        return list;
    }
}
