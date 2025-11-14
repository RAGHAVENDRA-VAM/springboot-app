package com.example.demo.controller;

import com.example.demo.model.PDProductResponse;
import com.example.demo.service.PdProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PDProductController {

    @Autowired
    private PdProductService service;


    @GetMapping("pdProductById/{id}")
    public PDProductResponse getPdProductById(@PathVariable("id")Long id){
        return service.getPdProductById(id);
    }
}
