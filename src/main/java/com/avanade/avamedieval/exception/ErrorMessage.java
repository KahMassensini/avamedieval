package com.avanade.avamedieval.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private HttpStatus statusCode;
    private String message;
    private String description;
}