package com.cherry.demo.eurekaclientproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient//启用Eureka服务发现
public class EurekaClientProductApplication {

    @RequestMapping("/")
    public String index() {
        return "欢迎来到eureka-client-product服务";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProductApplication.class, args);
    }

}
