package com.cherry.demo.eurekaclientconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/6 6:31 PM
 */

/*
 * @FeignClient:声明web接口调用的fegin客户端
 * name:是eureka服务提供者注册到Eureka服务里的名称
 * fallback:指明熔断后，执行的操作
 */
@FeignClient(name="eureka-client-product",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);
}
