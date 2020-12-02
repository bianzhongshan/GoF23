package com.ustb.builder.demo01;

public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    abstract Product getProduct();
}
