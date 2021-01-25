package com.solvd.market.shop;



public class AlcoholicDrink extends Drink  {
    private String expDate1;
    private int alcohol;
    private int protein;
    private int carbohydrate;
    private int kkal;



    public AlcoholicDrink() {

    }


    public AlcoholicDrink(String drinkName, String expDate1) {
        super();
        this.expDate1 = expDate1;
    }

    public String toString() {
        return "Alcoholic Drink : " + getDrinkName() + "    Expire Date is : " + expDate1;
    }

    public int getAlcohol() {
        return alcohol;
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

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }


    public void printInfo() {
        System.out.println("Name is " + getDrinkName());
        System.out.println("Alcohol " + alcohol + "%");
        System.out.println("Kkal " + kkal);

    }

}