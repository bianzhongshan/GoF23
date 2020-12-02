package com.ustb.factory.abstractfactory;

public class MiFactory implements ProductFactory {
    @Override
    public PhoneProduct getPhoneProduct() {
        return new MiPhone();
    }

    @Override
    public RouterProduct getRouterProduct() {
        return new MiRouter();
    }
}
