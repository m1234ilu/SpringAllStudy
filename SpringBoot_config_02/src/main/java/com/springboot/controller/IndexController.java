package com.springboot.controller;

import com.springboot.config.BookConfig;
import com.springboot.config.PhoneConfig;
import com.springboot.config.ZhuConfig;
import com.springboot.entity.BlogProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zycstart
 * @create 2019-08-20 1:27
 */
@RestController
public class IndexController {
    @Resource
    private BlogProperties blogProperties;
    @Resource
    private ZhuConfig zhuConfig;
      @Resource
    private BookConfig bookConfig;
    @Resource
    private PhoneConfig phoneConfig;

    @GetMapping(value = "/")
    public String index() {
        return blogProperties.getChinese() + "," + blogProperties.getTitle() + "," + blogProperties.getName();
    }

    @GetMapping(value = "zhu")
    public String zhu() {
        return zhuConfig.getName() + "," + zhuConfig.getGender();
    }

    @GetMapping(value = "phone")
    public String phone() {
        return phoneConfig.getName() + "," + phoneConfig.getPrice();
    }

    @GetMapping(value = "book")
    public String book() {
        return bookConfig.getName() + "," + bookConfig.getAuthor();
    }
}
