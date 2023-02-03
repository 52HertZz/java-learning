package com.example.designpattern.interceptor;

import com.example.designpattern.reflect.jdk.service.HelloService;
import com.example.designpattern.reflect.jdk.service.impl.HelloServiceImpl;

/**
 * @PackageName: com.example.designpattern.Interceptor
 * @FileName: Test
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class Test {
    public static void main(String[] args) {
        HelloService proxy1 = (HelloService)InterceptorJdkProxy.bind(new HelloServiceImpl(), "com.example.designpattern.interceptor.impl.Interceptor1");
        HelloService proxy2 = (HelloService)InterceptorJdkProxy.bind(proxy1, "com.example.designpattern.interceptor.impl.Interceptor2");
        HelloService proxy3 = (HelloService)InterceptorJdkProxy.bind(proxy2, "com.example.designpattern.interceptor.impl.Interceptor3");
        proxy3.sayHello();
    }
}
