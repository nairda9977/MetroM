package com.solvd.market.shop;

public abstract class Food {
    private String foodName;
    private String expDate;
    private int weight;
    private String quantity;

    public Food() {

    }

    public Food(String foodName, String expDate){
        this.foodName=foodName;
        this.expDate=expDate;
    }

    public Food(String foodName, String expDate, String quantity) {
        this.foodName = foodName;
        this.expDate = expDate;
        this.quantity=quantity;

    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public String toString  () {
        return "Product : " + foodName + "   Expiry Date is : " + expDate;

    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String printInfo() {

        return null;
    }



}
