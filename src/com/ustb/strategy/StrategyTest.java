package com.ustb.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext("正常收费");
        double result = cashContext.getResult(10.2);
        System.out.println(result);
    }

}
