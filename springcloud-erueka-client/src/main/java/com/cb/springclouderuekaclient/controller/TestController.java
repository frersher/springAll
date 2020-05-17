package com.cb.springclouderuekaclient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author cb
 * @since 2020/5/17
 */
@RequestMapping("/order")
public class TestController {

    @RequestMapping("/testOrder")
    public String queryUserInfoById() {
        return "hello,my name is order 01";
    }
}
