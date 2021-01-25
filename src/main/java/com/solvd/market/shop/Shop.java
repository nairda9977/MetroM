package com.solvd.market.shop;

public abstract class Shop implements Documentation {


    public void name() {
        System.out.println("Metro");
    }

    public void adress() {
        System.out.println("America, California, str. Robert Wilson ,N26");
    }

    public void size() {
        System.out.println("1300 M2");
    }

    public abstract void printInfo();
}
