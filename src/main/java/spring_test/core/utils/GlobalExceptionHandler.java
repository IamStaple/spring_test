package spring_test.core.utils;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {
 
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException() 
    {
        Map<String, String> responseError = new HashMap<>();
        responseError.put("message", "An Error Has Occured");

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseError);
    }
}
