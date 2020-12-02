package com.ustb.builder.demo02;

public class Test {
    public static void main(String[] args) {
        Builder worker = new Worker();
        //Product product = worker.getProduct();

        //链式法则 可以自由组合 不组合也有默认选择
        Product product = worker.buildB("雪碧").getProduct();
        System.out.println(product);
    }
}
