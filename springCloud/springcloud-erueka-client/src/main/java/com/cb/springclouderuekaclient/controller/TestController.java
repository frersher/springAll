package com.cb.springclouderuekaclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author cb
 * @since 2020/5/17
 */
@RequestMapping("/client")
@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String queryUserInfoById() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://MS-PROVIDER-USER/order/testOrder/",String.class);
        System.out.println("clientTest"+responseEntity.getBody());
        return responseEntity.getBody();
    }
}
