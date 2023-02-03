package com.example.designpattern.reflect.jdk.service.impl;

import com.example.designpattern.reflect.jdk.service.HelloService;

/**
 * @PackageName: com.example.designpattern.reflect.jdk.service.impl
 * @FileName: HelloServiceImpl
 * @Description:
 * @Author: Liuh
 * @Date: 2023/1/30
 */
public class HelloServiceImpl implements HelloService {

    /**
     * 说 hello
     */
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
