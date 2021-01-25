package com.solvd.market.shop;

public class Fruits extends com.solvd.market.shop.Food {
    private int protein;
    private int carbohydrate;
    private int fat;
    private int kkal;

    public Fruits() {
        super();
    }

    public Fruits(String foodName) {
        super();
    }

    public String toEat(){
        return "eatFruits";
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getProtein() {
        return protein;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFat() {
        return fat;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }


    public String printInfo() {
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");
        return null;
    }



}
