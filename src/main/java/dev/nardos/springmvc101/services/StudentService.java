package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(String id);
    Student saveStudent(Student student);
}
