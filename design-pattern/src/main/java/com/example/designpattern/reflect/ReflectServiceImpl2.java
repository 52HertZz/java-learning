package com.example.designpattern.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @PackageName: com.example.designpattern.reflect
 * @FileName: ReflectServiceImpl2
 * @Description: 有构造方法反射
 * @Author: Liuh
 * @Date: 2023/1/29
 */
public class ReflectServiceImpl2 {

    private String name;

    /**
     * 构造函数
     *
     * @param name
     */
    public ReflectServiceImpl2(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello " + name);
    }


    /**
     * 、
     * 通过反射的方式生成带构造函数的 ReflectServiceImpl2
     *
     * @param args
     */
    public static void main(String[] args) {
        ReflectServiceImpl2 object;
        try {
            // 有构造函数时通过反射生成对象
            object = (ReflectServiceImpl2) Class.forName("com.example.designpattern.reflect.ReflectServiceImpl2").getConstructor(String.class).newInstance("liuhuan");
            // 直接调用方法
            object.sayHello();
            // 反射调用方法
            Method method = object.getClass().getMethod("sayHello");
            method.invoke(object);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
