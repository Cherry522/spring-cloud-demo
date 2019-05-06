package com.cherry.demo.eurekaclientconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/6 6:31 PM
 */
@FeignClient(name="eureka-client-product")//声明web接口调用的fegin客户端
public interface HelloRemote {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
