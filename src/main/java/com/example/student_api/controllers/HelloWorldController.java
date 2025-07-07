package com.example.student_api.controllers;

import com.example.student_api.models.Student;
import com.example.student_api.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping
    public List<Student> getMethod() {
        return hws.getMethod();
    }

    @GetMapping("/{stdID}")
    public Student getStudentByID(@PathVariable int stdID) {
        return hws.getStudentById(stdID);
    }

    @GetMapping("/{department}")
    public Student getStudentByDepartment(@PathVariable String department) {
        return hws.getStudentByDepartment(department);
    }

    @PostMapping
    public String postMethod(@RequestBody Student student) {
        return hws.addStudent(student);
    }

    @PutMapping
    public String putMethod(@RequestBody Student student) {
        return hws.updateRecord(student);
    }

    @DeleteMapping("/all")
    public String deleteAllStudents() {
        return hws.deleteAllStudents();
    }

}
