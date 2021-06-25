package com.ustb.proxypattern;

public class Proxy implements GiveGift{

    public Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }
}
