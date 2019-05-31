package com.cherry.demo.consulproducer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * User: chenyan
 * Date: 2019/5/31 3:29 PM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello consul product 2";
    }
}
