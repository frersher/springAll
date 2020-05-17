package com.cb.springclouderuekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderProvider2Application.class, args);
    }

}
