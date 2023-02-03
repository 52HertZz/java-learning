package com.example.designpattern.observable;

/**
 * @PackageName: com.example.designpattern.observable
 * @FileName: TestObservable
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class TestObservable {

    public static void main(String[] args) {
        ProductList instance = ProductList.getInstance();
        JingDongObservable jd = new JingDongObservable();
        TaoBaoObservable tb = new TaoBaoObservable();

        // 被观察者新增观察者
        instance.addObserver(jd);
        instance.addObserver(tb);

        // 新增产品
        instance.addProduct("产品1");

    }
}
