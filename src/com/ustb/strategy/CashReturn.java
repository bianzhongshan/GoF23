package com.ustb.strategy;

public class CashReturn implements CashSuper{

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        System.out.println("return cash");
        double result = money;
        if(money >= moneyCondition)
            result = moneyCondition - moneyReturn;
        return result;
    }
}
