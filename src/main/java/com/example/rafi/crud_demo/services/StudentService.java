package com.example.rafi.crud_demo.services;
import com.example.rafi.crud_demo.models.Student;
import com.example.rafi.crud_demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(long id, Student updatedStudent) {
        updatedStudent.setId(id); // Ensure the ID is set
        return studentRepository.save(updatedStudent);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}