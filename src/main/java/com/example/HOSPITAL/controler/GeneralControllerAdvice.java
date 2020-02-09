package com.example.HOSPITAL.controler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class GeneralControllerAdvice {
    @ExceptionHandler(TestController.NotFoundException.class)
    public String notFound() {
        return "404";
    }
}
