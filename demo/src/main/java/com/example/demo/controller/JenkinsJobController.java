package com.example.demo.controller;

import com.example.demo.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsJobController {

    @Autowired
    private JenkinsService service;

    @GetMapping("/trigger")
    public String runJob() {
        return "Job run success";
    }
}
