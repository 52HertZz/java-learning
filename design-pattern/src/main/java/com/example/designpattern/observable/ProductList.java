package com.example.designpattern.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @PackageName: com.example.designpattern.observable
 * @FileName: ProductList
 * @Description: 被观察者 产品列表
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class ProductList extends Observable {

    /**
     * 产品列表
     */
    private List<String> productList = null;

    /**
     * 类唯一实例
     */
    private static ProductList instance;

    /**
     * 构造方法私有化
     */
    private ProductList() {
    }

    /**
     * 获取唯一实例
     *
     * @return
     */
    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    /**
     * 增加观察者
     *
     * @param o 观察者
     */
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public void addProduct(String newProduct) {
        productList.add(newProduct);
        System.out.println("产品列表新增产品：" + newProduct);
        // 用于告知观察者当前被观察者发生了变化
        this.setChanged();
        // 通知观察者，并传递新产品
        this.notifyObservers(newProduct);
    }
}
