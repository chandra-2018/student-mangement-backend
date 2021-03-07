package com.chandra.studentmanagement.exceptions;

public class ErrorResponseDto {

    private String message;
    private String code;
    private String type;

    public ErrorResponseDto() {
    }

    public ErrorResponseDto(String message) {
        this.message = message;

    }

    public ErrorResponseDto(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public ErrorResponseDto(String message, String code, String type) {
        this.message = message;
        this.code = code;
        this.type = type;
    }

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
