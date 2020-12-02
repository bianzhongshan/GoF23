package com.ustb.builder.demo01;

public class Test {
    public static void main(String[] args) {
        //创建一个指挥者
        Director director = new Director();
        Product product = director.buildProduct(new Worker());
        System.out.println(product);

    }
}
