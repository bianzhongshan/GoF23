package com.ustb.adapter;

//用的继承 类适配器 git单继承
//真正的适配器  连接usb 链接网线
public class Adapter extends NetWire implements NetToUsb{
    @Override
    public void handleRequest() {
        super.request();
    }
}
