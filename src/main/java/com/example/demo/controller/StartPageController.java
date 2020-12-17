package com.example.demo.controller;

import com.example.demo.util.AppProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartPageController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    AppProperties appProperties;

    @RequestMapping("/")
   // @ResponseBody
    String index(){
        logger.info("Method started");
        return "Welcome to '"+appProperties.getAppName() +"' Spring Boot app!";
    }
}
