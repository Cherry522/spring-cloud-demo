package com.cherry.demo.eurekaclientproduct;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/6 10:39 AM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "hello "+name+"，this is first messge";
    }
}
