package com.chandra.studentmanagement.exceptions;

public class StudentException extends RuntimeException {

    private String message;
    private String code;
    private String type;

    public StudentException() {

    }

    public StudentException(String message, String code, String type) {
        this.message = message;
        this.code = code;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
