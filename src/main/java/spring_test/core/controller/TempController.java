package spring_test.core.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/jsonplaceholder.typicode.com")
public class TempController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> sendHello() {
        return ResponseEntity.ok("Hello");
    }
}
