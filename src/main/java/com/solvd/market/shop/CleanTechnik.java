package com.solvd.market.shop;

public  class CleanTechnik implements Technik {
    private String name;
    private String issueDate;

    public CleanTechnik(){

    }
    public CleanTechnik(String name){
        this.name=name;
    }

    public String toString(){
        return "Air Clean : "+ name;
    }
    public String getName(String name){
        return this.name;
    }


    public void toClean() {

    }


}
