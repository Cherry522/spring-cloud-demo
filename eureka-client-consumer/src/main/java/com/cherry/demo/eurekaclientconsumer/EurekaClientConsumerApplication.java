package com.cherry.demo.eurekaclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient//启用服务注册客户端
@EnableFeignClients//启用REST请求的客户端工具Feign
@RestController
public class EurekaClientConsumerApplication {

    @RequestMapping("/")
    public String index(){
        return "欢迎来到eureka-client-consumer首页";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }

}
