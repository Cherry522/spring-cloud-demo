package com.cherry.demo.eurekaclientproduct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/6 10:39 AM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello "+name+"，this is first messge";
    }
}
