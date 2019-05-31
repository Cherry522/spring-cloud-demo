package com.cherry.demo.consulproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/31 3:29 PM
 */
@RestController
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/hello")
    public String hello() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("consul-producer");
        String result = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello", String.class);
        return result;
    }
}
