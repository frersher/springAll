package com.cb.springbootjdbc.service;

import lombok.Data;

/**
 * Created by chenbang on 2020/5/4.
 */
@Data
public class HelloService {
    private String msg;

    /**
     * 打招呼的类，用于在spring boot中调用
     *
     * @return
     */
    public String sayHello() {
        return "hello " + msg;
    }
}
