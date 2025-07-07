package com.example.student_api.repository;

import com.example.student_api.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Integer> {
    List<Student> findByDepartment(String department);
}
