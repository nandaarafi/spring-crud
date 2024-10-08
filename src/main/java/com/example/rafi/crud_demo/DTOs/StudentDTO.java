package com.example.rafi.crud_demo.DTOs;

import java.time.LocalDate;

import lombok.Data;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
}
