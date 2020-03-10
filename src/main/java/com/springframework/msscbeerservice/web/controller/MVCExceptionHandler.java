package com.springframework.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MVCExceptionHandler {

    public ResponseEntity<List> validationErrorController(ConstraintViolationException ex){
        List<String> errorsList = new ArrayList<>(ex.getConstraintViolations().size());
        // Information of the errors
        ex.getConstraintViolations().forEach(error -> errorsList.add(error.toString()));
        return new ResponseEntity<>(errorsList, HttpStatus.BAD_REQUEST);
    }
}
