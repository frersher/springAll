package com.cb.springbootjdbc.config;

import com.cb.springbootjdbc.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Created by chenbang on 2020/5/4.
 */
@Configuration //标记为配置类
@EnableConfigurationProperties(HelloServiceProperties.class) //使用java类作为配置文件
@ConditionalOnClass(HelloService.class) //需要被配置的类
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)
public class HelloServiceAutoconfiguration {
    @Resource
    private HelloServiceProperties helloServiceProperties;
    /**
     * 给bean注入参数，同时返回一个bean实例
     * 同时注解表名，返回是一个bean实例
     * 当容器中没有这个bean实例的时候，就返回一个自动注入好参数的bean实例回去
     * @return HelloService
     */
    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }

}
