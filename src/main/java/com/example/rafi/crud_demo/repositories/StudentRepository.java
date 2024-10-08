package com.example.rafi.crud_demo.repositories;

import com.example.rafi.crud_demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
