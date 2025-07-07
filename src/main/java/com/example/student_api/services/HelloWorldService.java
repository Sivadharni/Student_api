package com.example.student_api.services;

import com.example.student_api.models.Student;
import com.example.student_api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldService {
    @Autowired
    StudentRepository stdRepo;


    public List<Student> getMethod() {
        return stdRepo.findAll();
    }

    public Student getStudentById(int stdID) {
        return stdRepo.findById(stdID).orElse(new Student());
    }


    public Student getStudentByDepartment(String student){
        String department = null;
        return (Student) stdRepo.findByDepartment(department);
    }

    public String addStudent(Student student) {
        stdRepo.save(student);
        return "Student Added Successfully!!!";
    }

    public String updateStudent(Student student) {
        stdRepo.save(student);
        return "Student Updated Successfully!!!";
    }

    public String deleteStudentById(int stdID) {
        stdRepo.deleteById(stdID);
        return "Student Deleted Successfully!!!";
    }


    public String updateRecord(Student student) {
            return null;
    }

    public String deleteAllStudents() {
        stdRepo.deleteAll();
        return "All students deleted successfully!";
    }

}