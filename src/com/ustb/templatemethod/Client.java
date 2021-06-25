package com.ustb.templatemethod;

public class Client {
    public static void main(String[] args) {

        AbstractTestPaper teatPaperA = new TestPaperA();
        teatPaperA.testQuestion1();
        teatPaperA.testQuestion2();

        AbstractTestPaper teatPaperB = new TestPaperB();
        teatPaperA.testQuestion1();
        teatPaperB.testQuestion2();
    }
}
