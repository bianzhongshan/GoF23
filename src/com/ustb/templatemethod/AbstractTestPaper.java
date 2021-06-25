package com.ustb.templatemethod;

public abstract class AbstractTestPaper {
    // testQuestion 是不变的行为，在父类中实现
    public void testQuestion1(){
        System.out.println("第一个问题 a. b. c. d.");
        System.out.println("答案：" + answer1());
    }
    // answer 对于每个子类来说具体的实现都不相同
    // 具体的实现在子类中
    protected abstract String answer1();

    public void testQuestion2(){
        System.out.println("第一个问题 a. b. c. d.");
        System.out.println("答案：" + answer1());
    }
    protected abstract String answer2();
}
