package com.example.rafi.crud_demo.payloads.responses;

public record BodyResponse<Data>(
        String status,
        int code,
        String message,
        Data data
) {}
