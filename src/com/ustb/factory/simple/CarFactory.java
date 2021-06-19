package com.ustb.factory.simple;

//静态工厂 简单工厂模式
//如果增加大众车 得改变原来的代码 增加case 但是违背了开放封闭原则
public class CarFactory {
    public static Car getCar(String carName){
//        if(car.equals("五菱"))
//            return new WuLing();
//        else if(car.equals("特斯拉"))
//            return new Tesla();
//        else return null;
        Car car = null;
        switch (carName){
            case "五菱":
                car = new WuLing();
                break;
            case "特斯拉":
                car = new Tesla();
                break;
            default:
                break;
        }
        return car;
    }
}
