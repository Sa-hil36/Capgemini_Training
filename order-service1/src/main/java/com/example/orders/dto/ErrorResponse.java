package com.example.orders.dto;

public class ErrorResponse {

        private String timestamp;
        private String message;
        private int status;

        public ErrorResponse(String message, int status) {
            this.timestamp = java.time.LocalDate.now().toString();
            this.message = message;
            this.status = status;
        }
        public String getTimestamp() {
            return timestamp;
        }

        public String getMessage() {
            return message;
        }

        public int getStatus() {
            return status;
        }
    }

