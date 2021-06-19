package com.ustb.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("jiaojiao");

        Proxy daili = new Proxy(schoolGirl);

        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();
    }
}
