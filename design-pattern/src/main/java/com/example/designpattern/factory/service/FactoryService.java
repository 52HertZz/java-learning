package com.example.designpattern.factory.service;

/**
 * @PackageName: com.example.designpattern.factory.service
 * @FileName: FactoryService
 * @Description: 工厂类接口
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public interface FactoryService {

    /**
     * 创建产品
     *
     * @param productNo 产品编号
     * @return 产品
     */
    public String createProduct(String productNo);
}
