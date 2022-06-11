package com.hmittag.AppUpdateAlert.AppVersion.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AppVersionControllerAdvice {
    @ResponseBody
    @ExceptionHandler(AppVersionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(AppVersionNotFoundException ex) {
        return ex.getMessage();
    }
}
