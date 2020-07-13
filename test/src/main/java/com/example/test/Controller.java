package com.example.test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.example.test.TestService;

@RestController
public class Controller {
    @Autowired
    TestService testService;
    @PostMapping(value = "/api/v1/fundsell")
    public ResponseEntity<Test> getSomething() {
        Test test = testService.getURL();
        return new ResponseEntity<Test>(test, HttpStatus.OK);
    }
}
