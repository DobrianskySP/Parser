package com.unlimint.parser.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
@Slf4j
public class MainController {

    @PostMapping("/orders2")
    public ResponseEntity<?> parseJSON(){

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
