package com.ustb.adapter;

public class Adapter2 implements NetToUsb{
    NetWire netWire;

    public Adapter2(NetWire netWire) {
        this.netWire = netWire;
    }

    @Override
    public void handleRequest() {
        netWire.request();
    }
}
