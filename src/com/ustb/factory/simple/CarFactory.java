package com.ustb.factory.simple;

//静态工厂 简单工厂模式
//如果增加大众车 得改变原来的代码 增加elseif()
public class CarFactory {
    public static Car getCar(String car){
        if(car.equals("五菱"))
            return new WuLing();
        else if(car.equals("特斯拉"))
            return new Tesla();
        else return null;
    }
}
