package com.ustb.strategy;

public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        System.out.println("normal cash");
        return money;
    }
}
