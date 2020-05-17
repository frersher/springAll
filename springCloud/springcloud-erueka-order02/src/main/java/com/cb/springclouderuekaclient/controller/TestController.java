package com.cb.springclouderuekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author cb
 * @since 2020/5/17
 */
@RequestMapping("/order")
@RestController
public class TestController {

    @RequestMapping("/testOrder")
    public String queryUserInfoById() {
        return "hello,my name is order 02";
    }
}
