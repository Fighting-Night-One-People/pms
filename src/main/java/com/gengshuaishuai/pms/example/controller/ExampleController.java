package com.gengshuaishuai.pms.example.controller;

import com.gengshuaishuai.pms.core.responseresulthandle.ResponseResult;
import com.gengshuaishuai.pms.example.entity.Example;
import com.gengshuaishuai.pms.example.service.ExampleService;
import org.springframework.web.bind.annotation.*;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/1/20 12:50
 * @description
 */
@RestController
@RequestMapping("example")
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/getExample/{id}")
    public ResponseResult getExample(@PathVariable("id") String id){
        return exampleService.getExample(id);
    }
    @PostMapping("/createExample")
    public ResponseResult createExample(@RequestBody Example example){
        return exampleService.createExample(example);
    }
}
