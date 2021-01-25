package com.solvd.market.shop;

public final class WheatProduct extends com.solvd.market.shop.Food {
    private String typeWheat;
    private int protein;
    private int carbohydrate;
    private int fat;
    private int kkal;

    public WheatProduct() {

    }



    public String toEat(){
        return "EatWheat";
    }
    public void setTypeWheat(String typeWheat) {
        this.typeWheat = typeWheat;
    }

    public String getTypeWheat() {
        return typeWheat;
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
        System.out.println("Name : " + getFoodName());
        System.out.println("Type of wheat :" + typeWheat);
        System.out.println("Protein " + getProtein() + " gr");
        System.out.println("Carbohidrate " + getCarbohydrate() + " gr");
        System.out.println("Fat " + getFat() + " gr");
        System.out.println("Kkal " + getKkal());
        System.out.println("Weight " + getWeight() + " gr");

        return null;
    }

}
