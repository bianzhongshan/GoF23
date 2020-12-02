package com.ustb.factory.abstractfactory;

public class MiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开启");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关闭");
    }

    @Override
    public void openWife() {
        System.out.println("开启小米路由器Wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
