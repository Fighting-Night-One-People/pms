package com.gengshuaishuai.pms.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/20 12:50
 * @description
 */
@RestController
@RequestMapping("example")
public class HelloWorld {
    @GetMapping("/getExample/{id}")
    public String getString(@PathVariable("id") String id){
        return "Hello World";
    }
}
