package com.ustb.builder.demo01;

public class Worker extends Builder {

    Product product;

    public Worker() {
         product = new Product();
    }

    @Override
    void buildA() {
        product.setBuilderA("打地基");
        System.out.println("打地基");
    }

    @Override
    void buildB() {
       product.setBuilderB("铺设钢筋");
        System.out.println("铺设钢筋");
    }

    @Override
    void buildC() {
        product.setBuilderC("铺设电路");
        System.out.println("铺设电路");
    }

    @Override
    void buildD() {
        product.setBuilderC("粉刷");
        System.out.println("粉刷");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
