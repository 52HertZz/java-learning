package com.example.designpattern.builder;

/**
 * @PackageName: com.example.designpattern.builder
 * @FileName: TestBuilder
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class TestBuilder {

    public static void main(String[] args) {
        TicketHelper ticketHelper = new TicketHelper();
        ticketHelper.buildAdult("成人票");
        ticketHelper.buildChildrenForSeat("有座儿童票");
        ticketHelper.buildChildrenNoSeat("无座儿童票");
        ticketHelper.buildElderly("老年票");
        ticketHelper.buildSoldier("军人票");

        TicketBuilder.builder(ticketHelper);
    }
}
