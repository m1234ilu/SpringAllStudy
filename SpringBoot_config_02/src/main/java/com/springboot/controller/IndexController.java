package com.springboot.controller;

import com.springboot.entity.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zycstart
 * @create 2019-08-20 1:27
 */
@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @RequestMapping(value = "/")
    public String index(){
        return blogProperties.getChinese()+","+blogProperties.getTitle()+","+blogProperties.getName();
    }
}
