package com.example.rafi.crud_demo.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException() {
        super();
    }
    public StudentNotFoundException(String message) {
        super(message);
    }
}
