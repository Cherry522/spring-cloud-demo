package com.cherry.demo.eurekaclientconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/6 10:39 AM
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloRemote.hello(name);
//        return name;
    }
}
