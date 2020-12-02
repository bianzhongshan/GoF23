package com.ustb.factory.abstractfactory;

public class HuaweiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开启");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关闭");
    }

    @Override
    public void openWife() {
        System.out.println("开启华为路由器Wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
