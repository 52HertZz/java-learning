package com.example.designpattern.reflect.cglib;

import com.example.designpattern.reflect.jdk.service.impl.HelloServiceImpl;

/**
 * @PackageName: com.example.designpattern.reflect.cglib
 * @FileName: TestCglibProxy
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/1
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxyExample cglib = new CglibProxyExample();
        HelloServiceImpl proxy = (HelloServiceImpl) cglib.getProxy(HelloServiceImpl.class);
        proxy.sayHello();


    }
}
