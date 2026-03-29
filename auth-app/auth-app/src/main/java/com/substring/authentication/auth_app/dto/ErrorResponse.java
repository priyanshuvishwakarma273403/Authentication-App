package com.substring.authentication.auth_app.dto;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
        String message,
        HttpStatus status,
        int statusCode
) {
}
