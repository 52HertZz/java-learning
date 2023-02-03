package com.example.designpattern.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @PackageName: com.example.designpattern.reflect
 * @FileName: ReflectServiceImpl
 * @Description: 无构造方法反射
 * @Author: Liuh
 * @Date: 2023/1/29
 */
public class ReflectServiceImpl {

    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

    /**
     * 通过反射的方式生成无构造函数的 ReflectServiceImpl
     *
     * @return
     */
    public static void main(String[] args) {
        ReflectServiceImpl object;
        try {
            // 无构造函数时通过反射生成对象
            object = (ReflectServiceImpl) Class.forName("com.example.designpattern.reflect.ReflectServiceImpl").newInstance();
            // 直接调用方法
            object.sayHello("liuhuan");
            // 反射调用方法
            Method method = object.getClass().getMethod("sayHello", String.class);
            method.invoke(object, "liuhuan2");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
