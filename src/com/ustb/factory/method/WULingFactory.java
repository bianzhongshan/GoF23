package com.ustb.factory.method;

public class WULingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
