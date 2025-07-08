package com.example.student_api.models;

public class Student {

    private Integer stdID; // Or use 'int' if you don't need nulls
    private String name;
    private String department;

    public Student() {}

    public Student(Integer stdID, String name, String department) {
        this.stdID = stdID;
        this.name = name;
        this.department = department;
    }

    public Integer getStdID() {
        return stdID;
    }

    public void setStdID(Integer stdID) {
        this.stdID = stdID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
