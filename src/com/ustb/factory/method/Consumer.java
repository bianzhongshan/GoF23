package com.ustb.factory.method;

import com.ustb.factory.simple.CarFactory;

public class Consumer {
    public static void main(String[] args) {

        Car car1 = new WULingFactory().getCar();
        Car car2 = new TeslaFactory().getCar();
        car1.name();
        car2.name();
    }
}
