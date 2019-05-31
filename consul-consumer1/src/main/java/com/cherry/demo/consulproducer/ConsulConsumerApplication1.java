package com.cherry.demo.consulproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient//开启服务发现
public class ConsulConsumerApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication1.class, args);
    }

}
