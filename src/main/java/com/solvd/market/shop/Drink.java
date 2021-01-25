package com.solvd.market.shop;

public abstract class Drink  {
    final int nds=20;
    private String drinkName;
    private int weight;


    public Drink() {
        drinkName = "default";
    }

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }


    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void printInfo() {

    }


}
