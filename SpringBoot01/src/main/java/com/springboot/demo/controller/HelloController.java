package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zycstart
 * @create 2020-03-23 18:41
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "hello spring boot!";
    }
}
