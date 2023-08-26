package edu.mum.cs.cs425.edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

public class Student {
    private int studentId;
    private String name;
    private String dateOfAdmission;

    // Default Constructor
    public Student() {
        this.studentId = 0;
        this.name = "";
        this.dateOfAdmission = "";
    }

    // Constructor with all parameters
    public Student(int studentId, String name, String dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    // Constructor with two parameters
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = "";
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dateOfAdmission='" + dateOfAdmission + '\'' +
                '}';
    }
}