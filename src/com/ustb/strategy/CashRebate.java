package com.ustb.strategy;

public class CashRebate implements CashSuper {
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        System.out.println("rebate cash");
        double result;
        result = money * moneyRebate;
        return result;
    }
}
