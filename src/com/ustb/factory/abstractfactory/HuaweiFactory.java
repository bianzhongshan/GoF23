package com.ustb.factory.abstractfactory;

public class HuaweiFactory implements ProductFactory {
    @Override
    public PhoneProduct getPhoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct getRouterProduct() {
        return new HuaweiRouter();
    }
}
