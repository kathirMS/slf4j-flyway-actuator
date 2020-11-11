package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    Logger log = LoggerFactory.getLogger(HelloWorld.class);
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getString(){
        log.info("getString Method activated");
        return "HelloWorld";

    }
 }
