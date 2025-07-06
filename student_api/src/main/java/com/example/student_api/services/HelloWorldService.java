package com.example.student_api.services;

import com.example.student_api.models.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Service
public class HelloWorldService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(new Student(1, "Sivadharni", "IT"), new Student(2, "Thendral", "CSE"))
    );

    public List<Student> getMethod() {
        return students;
    }

    public Student getStudentById(int stdID) {
        for (Student s : students) {
            if (s.getStdID() != null && s.getStdID() == stdID) {
                System.out.println("Std_ID: " + s.getStdID() + " " + s);
                return s;
            }
        }
        return new Student();
    }


    public String postMethod(Student student) {
        students.add(student);
        return "Student Added Successfully";
    }


    public String deleteStudentByID(int stdID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStdID() != null && students.get(i).getStdID() == stdID) {
                students.remove(i);
                return "Deleted Student Successfully";
            }
        }
        return "No such Student Present";
    }


    public String updateRecord(Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStdID() != null && students.get(i).getStdID().equals(updatedStudent.getStdID())) {
                students.set(i, updatedStudent);
                return "Updated Student Successfully";
            }
        }
        return "No such Student Present";
    }
}