package com.ustb.factory.abstractfactory;

public class HuaweiPhone implements PhoneProduct{
    @Override
    public void start() {

        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短息");
    }
}
