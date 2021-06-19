package com.ustb.Proxy;

public class Pursuit implements GiveGift{

    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void GiveDolls() {
        System.out.println("送洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("送花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("送巧克力");
    }
}
