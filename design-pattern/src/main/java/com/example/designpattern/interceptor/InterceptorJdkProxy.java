package com.example.designpattern.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PackageName: com.example.designpattern.Interceptor
 * @FileName: InterceptorJdkProxy
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/1
 */
public class InterceptorJdkProxy implements InvocationHandler {

    /**
     * 真实对象
     */
    private Object object;

    /**
     * 拦截器全称
     */
    private String interceptorClass;

    public InterceptorJdkProxy(Object object, String interceptorClass) {
        this.object = object;
        this.interceptorClass = interceptorClass;
    }

    /**
     * 代理对象
     *
     * @param o
     * @param interceptorClass
     * @return
     */
    public static Object bind(Object o, String interceptorClass) {
        // 生成代理对象，建立代理对象和真实对象的关系
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),
                o.getClass().getInterfaces(),
                new InterceptorJdkProxy(o, interceptorClass));
    }

    /**
     * 实现代理方法
     *
     * @param proxy  代理对象
     * @param method 当前调度方法
     * @param args   当前方法的参数
     * @return 代理返回结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 没有设置拦截器
        if (interceptorClass == null) {
            return method.invoke(object, args);
        }
        Object result = null;

        // 通过反射生成拦截器
        Interceptor interceptor = (Interceptor) Class.forName(interceptorClass).newInstance();

        // 调用前置方法
        if (interceptor.before(proxy, object, method, args)) {
            result = method.invoke(object, args);
        } else {
            // 调用拦截器 around 方法
            interceptor.around(proxy, object, method, args);
        }
        // 调用拦截器后置方法 after
        interceptor.after(proxy, object, method, args);

        return result;
    }


}
