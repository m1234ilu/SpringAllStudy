package com.springboot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zycstart
 * @create 2020-03-23 19:32
 */
@Configuration
@PropertySource(value = "classpath:book.properties", encoding = "UTF-8")
@Data
public class BookConfig {
    @Value("${book.name}")
    private String name;
    @Value("${book.author.first}")
    private String author;
}
