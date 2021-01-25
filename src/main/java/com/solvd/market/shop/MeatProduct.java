package com.solvd.market.shop;


public class MeatProduct extends com.solvd.market.shop.Food {
    private String typeOfMeatProduct;
    private String protein;
    private int kkal;
    public final int NDS = 20;

    public MeatProduct() {
        super();
    }

    public MeatProduct(String typeOfMeatProduct, String foodName, String expDate, String quantity) {
        super(foodName, expDate, quantity);
        this.typeOfMeatProduct=typeOfMeatProduct;
    }

    public MeatProduct(String foodName,  String protein) {
        super(foodName, protein);
        this.protein=protein;
    }
    public String toString() {
        return printInfo();
    }

    public String printInfo() {
        System.out.println("===Meat Products===");
        System.out.println("Type of milk product = " + typeOfMeatProduct);
        System.out.println("Name     : " + getFoodName());
        System.out.println("Exp Date : " + getExpDate());
        System.out.println("Quantity : " + getQuantity());
        return " ";
    }


    public void setTypeOfMeatProduct(String typeOfMeatProduct) {
        this.typeOfMeatProduct = typeOfMeatProduct;
    }

    public String getTypeOfMeatProduct() {
        return typeOfMeatProduct;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getProtein() {
        return protein;
    }


    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }




}
