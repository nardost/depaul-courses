package dev.nardos.springmvc101.services;

import dev.nardos.springmvc101.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceMapImpl implements StudentService {

    private Map<String, Student> studentsMap;

    public StudentServiceMapImpl() {
        this.studentsMap = new HashMap<>();
        loadStudents();
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(getStudentsMap().values());
    }

    @Override
    public Student getStudentById(String id) {
        return (Student) getStudentsMap().get(id);
    }

    @Override
    public Student saveStudent(Student student) {
        getStudentsMap().put(student.getId(), student);
        return student;
    }

    private Map<String, Student> getStudentsMap() {
        return this.studentsMap;
    }

    private void loadStudents() {
        Student student;
        student = new Student("100001", "Chinua", "Achebe", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100002", "Nardos", "Tessema", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100003", "Challa", "Abebe", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100004", "China", "Ashebo", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100005", "Ratana", "Ty", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100006", "Setegn", "Shanqo", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100007", "Sisay", "Mebre", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100008", "Mulatu", "Ayele", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("100009", "Ayichew", "Dagnew", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
        student = new Student("10000a", "Iyesusworq", "Zafu", "cachebe@mail.depaul.edu", "Software Engineering");
        getStudentsMap().put(student.getId(), student);
    }
}
