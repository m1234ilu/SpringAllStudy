package com.springboot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zycstart
 * @create 2020-03-23 19:42
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "phone")
@PropertySource(value = "classpath:phone.yml", encoding = "UTF-8")
public class PhoneConfig {
    @Value("${name}")
    private String name;
    @Value("111")
    private String price;
}
