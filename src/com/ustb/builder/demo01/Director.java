package com.ustb.builder.demo01;

//指挥 负责指挥一个工程
public class Director {
    public Product buildProduct(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
