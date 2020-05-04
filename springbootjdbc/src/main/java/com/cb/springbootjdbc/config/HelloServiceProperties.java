package com.cb.springbootjdbc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by chenbang on 2020/5/4.
 */
@ConfigurationProperties(prefix = "hello")
@Data
public class HelloServiceProperties {
    //默认配置的值
    private final static String Msg = "cb";

    /**
     *  由于在configuationProperties中配置了前缀，所以可以在application.properties中使用hello.msg配置该值。
     */
    private String msg = Msg;

}
