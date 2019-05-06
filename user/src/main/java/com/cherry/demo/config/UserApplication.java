package com.cherry.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserApplication {

    @RequestMapping("/")
    public String home(){
        return "欢迎进入user服务";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
