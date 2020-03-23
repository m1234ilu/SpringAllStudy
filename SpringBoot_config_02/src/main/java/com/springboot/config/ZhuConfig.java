package com.springboot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author zycstart
 * @create 2020-03-23 19:07
 */
@Configuration
@Data
public class ZhuConfig {
    @Value("${zhuzhu.name}")
    private String name;
    @Value("${zhuzhu.gender}")
    private String gender;
}
