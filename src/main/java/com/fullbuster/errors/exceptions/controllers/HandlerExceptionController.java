package com.fullbuster.errors.exceptions.controllers;

import com.fullbuster.errors.exceptions.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler({ArithmeticException.class})
    public ResponseEntity<?> divisionByCero(Exception ex) {

        return ResponseEntity.internalServerError().body("ERROR 500");
    }

}
