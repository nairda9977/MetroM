package com.solvd.market.shop;

public class MilkProducts extends com.solvd.market.shop.Food {
    private String typeOfMilkProduct;
    private int protein;
    private int carbohydrate;
    private String fat;
    private int kkal;

    public MilkProducts() {

        super();
    }

    public MilkProducts(String foodName, String expDate) {
        super(foodName, expDate);
    }

    public MilkProducts(String typeOfMilkProduct, String foodName, String expDate, String quantity) {
        super(foodName, expDate, quantity);
        this.typeOfMilkProduct = typeOfMilkProduct;

    }


    public void printException() {

    }

    public String toString() {
        return printInfo();
    }

    public String printInfo() {
        System.out.println("===Milk Products===");
        System.out.println("Type of milk product = " + typeOfMilkProduct);
        System.out.println("Name     : " + getFoodName());
        System.out.println("Exp Date : " + getExpDate());
        System.out.println("Quantity : " + getQuantity());
        return " ";
    }

    public String toEat() {
        return "toEat";
    }


    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getProtein() {
        return protein;
    }

    public void setTypeOfMilkProduct(String typeOfMilkProduct) {
        this.typeOfMilkProduct = typeOfMilkProduct;
    }

    public String getTypeOfMilkProduct() {
        return typeOfMilkProduct;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getFat() {
        return fat;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }




}
