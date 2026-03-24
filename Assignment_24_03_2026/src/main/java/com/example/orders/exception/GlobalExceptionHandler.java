package com.example.orders.exception;

import com.example.orders.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    @RestControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(OrderNotFoundException.class)
        public ResponseEntity<ErrorResponse> handleException(OrderNotFoundException e) {
            com.example.orders.dto.ErrorResponse error = new ErrorResponse(
                    e.getMessage(),
                    HttpStatus.NOT_FOUND.value()
            );

            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }

        @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<Map<String, Object>> handleValidationException(
                MethodArgumentNotValidException e) {

            List<String> errors = e.getBindingResult()
                    .getFieldErrors()
                    .stream()
                    .map(error -> error.getDefaultMessage())
                    .toList();

            Map<String, Object> response = new HashMap<>();
            response.put("timestamp", java.time.LocalDate.now().toString());
            response.put("errors", errors);

            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

