package com.ustb.factory.abstractfactory;

public class Consumer {
    public static void main(String[] args) {
        System.out.println("==========小米工厂=========");
        MiFactory miFactory = new MiFactory();
        PhoneProduct miPhone = miFactory.getPhoneProduct();
        RouterProduct miRouter = miFactory.getRouterProduct();
        miPhone.start();;
        miRouter.start();
    }
}
