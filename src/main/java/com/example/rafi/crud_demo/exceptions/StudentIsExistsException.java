package com.example.rafi.crud_demo.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentIsExistsException {
    public StudentIsExistsException() {}

    public StudentIsExistsException(String message) {
        super();
    }
}
