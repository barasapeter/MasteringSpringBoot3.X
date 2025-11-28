package com.barasa.learn;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String simpleHelloMessage() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public Map<String, String> jsonHelloMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello From Hello with JSON!!");
        return response;
    }

    @GetMapping("/hello/with-status-code")
    public ResponseEntity<Map<String, String>> jsonHelloMessageWithStatusCode() {
        Map<String, String> returnMessage = new HashMap<>();
        returnMessage.put("message", "Hello From Hello With Status Code!");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(returnMessage);
    }

}
