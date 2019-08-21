package com.springboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zycstart
 * @create 2019-08-20 1:20
 */

@Component
@Data
public class BlogProperties {

    @Value("${zyc.blog.name}")
    private String name;

    @Value("${zyc.blog.title}")
    private String title;

    @Value("${zyc.blog.chinese}")
    private String chinese;

}
