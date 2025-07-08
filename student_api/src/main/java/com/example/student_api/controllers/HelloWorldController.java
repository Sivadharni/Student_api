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
    public Student getStudentID(@PathVariable int stdID) {
        return hws.getStudentById(stdID);
    }

    @PostMapping
    public String postMethod(@RequestBody Student student) {
        return hws.postMethod(student);
    }

    @PutMapping
    public String putMethod(@RequestBody Student student) {
        return hws.updateRecord(student);
    }

    @DeleteMapping("/{stdID}")
    public String deleteMethod(@PathVariable int stdID) {
        return hws.deleteStudentByID(stdID);
    }
}
