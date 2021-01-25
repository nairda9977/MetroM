package com.solvd.market.shop;

public class SmartTechnik implements Technik  {
    private String name;
    private String issueYear;
    private String model;

    public SmartTechnik(){

    }
    public SmartTechnik(String name, String issueYear, String model){
        this.name=name;
        this.issueYear=issueYear;
        this.model=model;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setIssueYear(String issueYear) {
        this.issueYear = issueYear;
    }

    public String getIssueYear() {
        return issueYear;
    }
}
