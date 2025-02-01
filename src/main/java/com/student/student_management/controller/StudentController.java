package com.student.student_management.controller;

import com.student.student_management.model.Student;
import com.student.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {


    //object of service layer
    @Autowired
    StudentService service;

    @GetMapping("/student")
    public Student getStudent(){
        return service.getStudent();
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String s1,@PathVariable("lastName") String s2){
        return service.studentPathVariable(s1,s2);
    }

    @GetMapping("/student/query")
    public Student queryReqParamStudent(@RequestParam(name="firstName") String s1,@RequestParam(name = "lastName") String s2){
        return service.queryReqParamStudent(s1,s2);
    }
}
