package com.example.designpattern.reflect.jdk;

import com.example.designpattern.reflect.jdk.service.HelloService;
import com.example.designpattern.reflect.jdk.service.impl.HelloServiceImpl;

/**
 * @PackageName: com.example.designpattern.reflect.jdk
 * @FileName: TestJdkProxy
 * @Description:
 * @Author: Liuh
 * @Date: 2023/1/30
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        JdkProxyExample jdk = new JdkProxyExample();
        // 只能通过接口调用
        HelloService bind = (HelloService) jdk.bind(new HelloServiceImpl());
        // 此时 HelloService 是一个代理对象，它会进入代理的逻辑方法 invoke 里
        bind.sayHello();
    }
}
