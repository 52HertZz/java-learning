package com.example.designpattern.builder;

/**
 * @PackageName: com.example.designpattern.builder
 * @FileName: TicketHelper
 * @Description: 配置类
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class TicketHelper {

    public void buildAdult(String info) {
        System.out.println("构建成人票逻辑：" + info);
    }

    public void buildChildrenForSeat(String info) {
        System.out.println("构建有座儿童票逻辑：" + info);
    }

    public void buildChildrenNoSeat(String info) {
        System.out.println("构建无座儿童票逻辑：" + info);
    }

    public void buildElderly(String info) {
        System.out.println("构建有老年人票逻辑：" + info);
    }

    public void buildSoldier(String info) {
        System.out.println("构建军人及家属票逻辑：" + info);
    }
}
