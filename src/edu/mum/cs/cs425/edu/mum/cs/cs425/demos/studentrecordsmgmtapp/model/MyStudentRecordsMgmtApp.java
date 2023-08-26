package edu.mum.cs.cs425.edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        // Create an array of Students
        Student[] students = new Student[5];

        students[0] = new Student(110001, "Mule", "11/18/1951");
        students[1] = new Student(110002, "Hagos", "12/07/1990");
        students[2] = new Student(110003, "Abebe", "01/31/1974");
        students[3] = new Student(110004, "Kebede", "08/22/2009");
        students[4] = new Student(110005, "Sara", "03/05/1990");


        printListOfStudents(students);

        // Get and print the list of PlatinumAlumni students
        List<Student> platinumAlumniStudents = getListOfPlatinumAlumniStudents(students);
        System.out.println("\nPlatinum Alumni Students:");
        for (Student student : platinumAlumniStudents) {
            System.out.println(student);
        }
    }

    public static void printListOfStudents(Student[] students) {

        Arrays.sort(students, Comparator.comparing(Student::getName));

        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumniStudents = new ArrayList<>();
        int currentYear = 2023;  // Current year

        Arrays.sort(students, Comparator.comparing(Student::getDateOfAdmission).reversed());

        for (Student student : students) {
            String[] dateParts = student.getDateOfAdmission().split("/");
            int admissionYear = Integer.parseInt(dateParts[2]);
            if (currentYear - admissionYear >= 30) {
                platinumAlumniStudents.add(student);
            }
        }

        return platinumAlumniStudents;
    }

}




