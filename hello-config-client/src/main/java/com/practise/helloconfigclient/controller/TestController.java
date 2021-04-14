package com.practise.helloconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Autowired
    private Environment environment;

//    private final Environment environment;
//
//    public TestController(Environment environment) {
//        this.environment = environment;
//    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHello(Model model) {
        return new ResponseEntity<String>(environment.getProperty("message"), HttpStatus.OK);
    }

//    @PostMapping("/actuator/refresh")
//    public void actuatorRefreshing() {
//        System.err.println("Actuator Refresh Invoked!");
//    }
}
