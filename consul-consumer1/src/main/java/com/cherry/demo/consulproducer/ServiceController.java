package com.cherry.demo.consulproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/31 3:45 PM
 */
@RestController
public class ServiceController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取指定服务id的所有服务列表
     * 访问地址：http://localhost:8503/services?serviceId=consul-producer
     * @param serviceId
     * @return
     */
    @RequestMapping("/services")
    public Object services(@RequestParam("serviceId") String serviceId){
        return discoveryClient.getInstances(serviceId);
    }

    /**
     * 从所有服务中选中一个轮询。
     * 访问地址：http://localhost:8503/discover?serviceId=consul-producer
     * @param serviceId
     * @return
     */
    @RequestMapping("/discover")
    public Object discover(@RequestParam("serviceId") String serviceId){
        return loadBalancerClient.choose(serviceId).getUri().toString();
    }

}
