package com.chandra.studentmanagement.exceptions;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponseDto handleConstraintValidation(ConstraintViolationException exception, HttpServletRequest request) {
        return new ErrorResponseDto(exception.getMessage(), String.valueOf(exception.getErrorCode()), "validation");
    }


    @ExceptionHandler(value = {StudentException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDto handleInternalServerError(StudentException exception) {
        return new ErrorResponseDto(exception.getMessage(), exception.getCode(), exception.getType());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDto handleInternalServerError(Exception exception) {
        return new ErrorResponseDto(exception.getMessage(), String.valueOf("500"), "Internal_Server_Error");
    }

}
