package com.cherry.demo.eurekaclientconsumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Describe:HelloRemote熔断操作
 * User: chenyan
 * Date: 2019/5/9 10:50 AM
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello " +name+", this messge send failed .";
    }
}
