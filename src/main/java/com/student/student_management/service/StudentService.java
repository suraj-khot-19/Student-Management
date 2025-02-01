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

    public Student studentPathVariable(String s1,String s2) {
        return new Student(s1,s2);
    }

    public Student queryReqParamStudent(String s1,String s2) {
        return new Student(s1,s2);
    }
}
