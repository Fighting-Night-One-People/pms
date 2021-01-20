package com.gengshuaishuai.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 耿帅帅
 */
@SpringBootApplication
@RestController
public class PmsApplication {
    @GetMapping("/")
    public static String welcome(){
        return "Welcome To pms";
    }
    public static void main(String[] args) {
        SpringApplication.run(PmsApplication.class, args);
    }

}
