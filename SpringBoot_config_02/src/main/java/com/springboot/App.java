package com.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zycstart
 * @create 2019-08-20 1:08
 */

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        // SpringApplication.run(App.class,args);
        // 禁用banner
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Mode.OFF);
        app.run(args);
    }
}
