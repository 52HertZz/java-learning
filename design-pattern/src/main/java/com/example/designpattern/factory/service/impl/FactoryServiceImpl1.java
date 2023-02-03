package com.example.designpattern.factory.service.impl;

import com.example.designpattern.factory.service.FactoryService;

/**
 * @PackageName: com.example.designpattern.factory.service.impl
 * @FileName: FactoryServiceImpl1
 * @Description: 具体工厂 1
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class FactoryServiceImpl1 implements FactoryService {
    /**
     * 创建产品
     *
     * @param productNo 产品编号
     * @return 产品
     */
    @Override
    public String createProduct(String productNo) {
        return "产品 1";
    }
}
