package com.example.rafi.crud_demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rafi.crud_demo.DTOs.StudentDTO;
import com.example.rafi.crud_demo.models.Student;
import com.example.rafi.crud_demo.payloads.responses.BodyResponse;
import com.example.rafi.crud_demo.services.StudentService;

import io.swagger.v3.oas.annotations.Operation;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    @Operation(summary = "Get all students")
    public ResponseEntity<BodyResponse<List<Student>>> getAllStudents() {
        return new ResponseEntity<>(
                new BodyResponse<>(
                        HttpStatus.OK.getReasonPhrase(),
                        HttpStatus.OK.value(),
                        "All student data",
                        this.studentService.getAllStudents()
                ),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get student by id")
    public ResponseEntity<BodyResponse<Optional<Student>>> getStudentById(@PathVariable long id) {
        return new ResponseEntity<>(
                new BodyResponse<>(
                        HttpStatus.OK.getReasonPhrase(),
                        HttpStatus.OK.value(),
                        String.format("Student data with id %d", id),
                        this.studentService.getStudentById(id)
                ),
                HttpStatus.OK
        );
    }

    @PostMapping()
    @Operation(summary = "Add a new student")
    public ResponseEntity<BodyResponse<Student>> addStudent(@RequestBody StudentDTO student) {
        return new ResponseEntity<>(
                new BodyResponse<>(
                        HttpStatus.CREATED.getReasonPhrase(),
                        HttpStatus.CREATED.value(),
                        "Successfully added new student",
                        this.studentService.addStudent(
                                new Student(0L, student.getName(), student.getEmail(), student.getDob(), student.getAge())
                        )
                ),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update student information")
    public ResponseEntity<BodyResponse<Student>> updateStudent(@RequestBody StudentDTO student, @PathVariable long id) {
        return new ResponseEntity<>(
                new BodyResponse<>(
                        HttpStatus.OK.getReasonPhrase(),
                        HttpStatus.OK.value(),
                        String.format("Successfully updated student with id %d", id),
                        this.studentService.updateStudent(id, new Student(id, student.getName(), student.getEmail(), student.getDob(), student.getAge()))
                ),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete student")
    public ResponseEntity<BodyResponse<Void>> deleteStudent(@PathVariable long id) {
        this.studentService.deleteStudent(id);
        return new ResponseEntity<>(
                new BodyResponse<>(
                        HttpStatus.OK.getReasonPhrase(),
                        HttpStatus.OK.value(),
                        String.format("Successfully deleted student with id %d", id),
                        null
                ),
                HttpStatus.OK
        );
    }
}
