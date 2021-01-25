package com.solvd.market.shop;


public class Phones extends SmartTechnik{
    private String numberOfSim;
    public Phones(){

    }
    public Phones(String name,  String model,String issueYear, String numberOfSim){
        super(name, issueYear, model);
        this.numberOfSim= numberOfSim;
    }


    public void setNumberOfSim(String numberOfSim) {
        this.numberOfSim = numberOfSim;
    }

    public String getNumberOfSim() {
        return numberOfSim;
    }

    public String toString(){
        return  printFields();
    }


    public String printFields(){
        System.out.println("===Phone details===");
        System.out.println("Name       : "+getName());
        System.out.println("Model      : " + getModel());
        System.out.println("Year       : " + getIssueYear());
        System.out.println("NUmber SIM : "+ numberOfSim);
        return " ";
    }
}
