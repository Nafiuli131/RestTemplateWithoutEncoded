package com.example.webClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    Service service;
    @GetMapping()
    public ResponseEntity<?> call(){
        return new ResponseEntity<>(service.work(), HttpStatus.OK);
    }
}
