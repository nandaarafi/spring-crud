package com.example.rafi.crud_demo.payloads.responses;

public record ExceptionResponse(
        String path,
        String ctx
) {}