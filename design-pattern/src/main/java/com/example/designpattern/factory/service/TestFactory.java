package com.example.designpattern.factory.service;

import com.example.designpattern.factory.service.impl.ProductFactory;

/**
 * @PackageName: com.example.designpattern.factory.service
 * @FileName: TestFactory
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class TestFactory {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        String product = productFactory.createProduct("100");
        System.out.println(product);
    }
}
