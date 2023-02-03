package com.example.designpattern.factory.service.impl;

import com.example.designpattern.factory.service.FactoryService;

/**
 * @PackageName: com.example.designpattern.factory.service.impl
 * @FileName: ProductFactory
 * @Description: 抽象工厂
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class ProductFactory implements FactoryService {
    /**
     * 创建产品
     *
     * @param productNo 产品编号
     * @return 产品
     */
    @Override
    public String createProduct(String productNo) {
        char ch = productNo.charAt(0);
        FactoryService factoryService = null;
        switch (ch) {
            case '1':
                factoryService = new FactoryServiceImpl1();
                break;
            case '2':
                factoryService = new FactoryServiceImpl2();
                break;
            case '3':
                factoryService = new FactoryServiceImpl3();
                break;
        }
        if (factoryService != null) {
            return factoryService.createProduct(productNo);
        }
        return null;
    }
}
