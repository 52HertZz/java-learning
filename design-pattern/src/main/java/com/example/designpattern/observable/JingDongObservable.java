package com.example.designpattern.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * @PackageName: com.example.designpattern.observable
 * @FileName: JingDongObservable
 * @Description: 观察者 京东
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class JingDongObservable implements Observer {

    /**
     * @param o   被观察者
     * @param arg 产品
     */
    @Override
    public void update(Observable o, Object arg) {
        String newProduct = (String) arg;
        System.err.println("发送新产品【" + newProduct + "】到京东");

    }
}
