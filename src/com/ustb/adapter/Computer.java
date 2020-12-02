package com.ustb.adapter;

//客户端 想上网 插不上网线
public class Computer {

    public void net(NetToUsb adapter){
        adapter.handleRequest();
        //上网的具体实现 找一个转接头
    }

    public static void main(String[] args) {
//        Computer computer =new Computer();//电脑
//        NetWire netWire = new NetWire();//网线
//        Adapter adapter = new Adapter();//转接器

        Computer computer =new Computer();//电脑
        NetWire netWire = new NetWire();//网线
        Adapter2 adapter = new Adapter2(netWire );//转接器
        computer.net(adapter);
    }
}
