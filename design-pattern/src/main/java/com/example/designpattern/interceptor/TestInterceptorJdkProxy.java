package com.example.designpattern.interceptor;

import com.example.designpattern.reflect.jdk.service.HelloService;
import com.example.designpattern.reflect.jdk.service.impl.HelloServiceImpl;

/**
 * @PackageName: com.example.designpattern.Interceptor
 * @FileName: TestInterceptorJdkProxy
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/1
 */
public class TestInterceptorJdkProxy {
    public static void main(String[] args) {
        HelloService proxy = (HelloService)InterceptorJdkProxy.bind(new HelloServiceImpl(), "com.example.designpattern.interceptor.impl.MyInterceptor");
        proxy.sayHello();
    }
}
