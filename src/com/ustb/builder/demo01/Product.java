package com.ustb.builder.demo01;

public class Product {
    public String builderA;
    public String builderB;
    public String builderC;
    public String builderD;

    public String getBuilderA() {
        return builderA;
    }

    public void setBuilderA(String builderA) {
        this.builderA = builderA;
    }

    public String getBuilderB() {
        return builderB;
    }

    public void setBuilderB(String builderB) {
        this.builderB = builderB;
    }

    public String getBuilderC() {
        return builderC;
    }

    public void setBuilderC(String builderC) {
        this.builderC = builderC;
    }

    public String getBuilderD() {
        return builderD;
    }

    public void setBuilderD(String builderD) {
        this.builderD = builderD;
    }

    @Override
    public String toString() {
        return "Product{" +
                "builderA='" + builderA + '\'' +
                ", builderB='" + builderB + '\'' +
                ", builderC='" + builderC + '\'' +
                ", builderD='" + builderD + '\'' +
                '}';
    }
}
