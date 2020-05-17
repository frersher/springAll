package com.cb.springclouderuekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderPrivider1Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderPrivider1Application.class, args);
    }

}
