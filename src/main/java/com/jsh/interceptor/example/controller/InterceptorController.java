package com.jsh.interceptor.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class InterceptorController {
    private final Logger logger = LoggerFactory.getLogger(InterceptorController.class);

    @GetMapping("/home")
    public String home(){
        logger.info("home call");
        return "home call";
    }

    @GetMapping("/example")
    public String example(){
        logger.info("example call");
        return "example call";
    }
}
