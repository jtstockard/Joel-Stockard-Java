package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.model.CustomErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.webjars.NotFoundException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
    public class ControllerExceptionHandler {

        public ResponseEntity<List<CustomErrorResponse>> newResponseErrors(MethodArgumentNotValidException e) {

            // BindingResult holds the validation errors
            BindingResult result = e.getBindingResult();

            // Validation errors are stored in FieldError objects
            List<FieldError> fieldErrors = result.getFieldErrors();

            // Translate the FieldErrors to CustomErrorResponse
            List<CustomErrorResponse> errorResponseList = new ArrayList<>();

            for (FieldError fieldError : fieldErrors) {
                CustomErrorResponse errorResponse = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), fieldError.getDefaultMessage());
                errorResponse.setTimestamp(LocalDateTime.now());
                errorResponse.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
                errorResponseList.add(errorResponse);
            }

            // Create and return the ResponseEntity
            ResponseEntity<List<CustomErrorResponse>> responseEntity = new ResponseEntity<>(errorResponseList, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;
        }

        @ExceptionHandler(value = IllegalArgumentException.class)
        @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
        public ResponseEntity<CustomErrorResponse> outOfRangeException(IllegalArgumentException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
            error.setStatus((HttpStatus.UNPROCESSABLE_ENTITY.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;
        }

        @ExceptionHandler(value = IndexOutOfBoundsException.class)
        @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
        public ResponseEntity<CustomErrorResponse> notFoundException(IndexOutOfBoundsException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
            error.setStatus((HttpStatus.UNPROCESSABLE_ENTITY.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;
        }

        @ExceptionHandler(value = ArithmeticException.class)
        @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
        public ResponseEntity<CustomErrorResponse> CannotDivideByZeroException(ArithmeticException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
            error.setStatus((HttpStatus.UNPROCESSABLE_ENTITY.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;
        }

        @ExceptionHandler(value = NotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public ResponseEntity<CustomErrorResponse> notFoundException(NotFoundException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.NOT_FOUND.toString(), e.getMessage());
            error.setStatus((HttpStatus.NOT_FOUND.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
            return responseEntity;
        }

        @ExceptionHandler(value = HttpMessageNotReadableException.class)
        @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
        public ResponseEntity<CustomErrorResponse> notIntegerException(HttpMessageNotReadableException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
            error.setStatus((HttpStatus.UNPROCESSABLE_ENTITY.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;
        }

        @ExceptionHandler(value = MethodArgumentNotValidException.class)
        @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
        public ResponseEntity<CustomErrorResponse> notNullException(MethodArgumentNotValidException e) {
            CustomErrorResponse error = new CustomErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(), e.getMessage());
            error.setStatus((HttpStatus.UNPROCESSABLE_ENTITY.value()));
            error.setTimestamp(LocalDateTime.now());
            ResponseEntity<CustomErrorResponse> responseEntity = new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
            return responseEntity;

        }
    }

