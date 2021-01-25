package com.solvd.market.operation;

import com.solvd.market.shop.Phones;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MenuTechnik {

    List<Phones> phoneHouse;

    public MenuTechnik() {
        phoneHouse = new LinkedList<Phones>();
    }

    public void choseOption() {
        System.out.println("1.Work with Phones");
        System.out.println("2.Work with Laptops");
        Scanner option = new Scanner(System.in);
        switch (option.nextLine()) {
            case "1":
                addPhone();
            case "2":
                addLaptop();
        }
    }


    public void addPhone() {
        Phones phones = new Phones(phoneName(), phoneModel(), phoneIssueYear(), phoneNumOfSim());
        addPhoneToCol(phones);
        System.out.println("Add again ? ");
        Scanner aswer = new Scanner(System.in);
        String ans = aswer.nextLine();
        if (ans.equalsIgnoreCase("Y")) {
            addPhone();
        } else printPhoneCol();
    }

    public void addLaptop() {

    }

    public String phoneName() {
        System.out.println("Please enter name");
        Scanner nameSc = new Scanner(System.in);
        String name = nameSc.nextLine();
        while (name.isEmpty()) {
            System.out.println("Please enter phone NAME");
            name = nameSc.nextLine();
        }
        return name;
    }

    public String phoneIssueYear() {
        System.out.println("Please enter issue year");
        Scanner issueYarSc = new Scanner(System.in);
        String issueYear = issueYarSc.nextLine();
        while (issueYear.isEmpty()) {
            System.err.println("Please enter issue year");
            issueYear = issueYarSc.nextLine();
        }
        return issueYear;
    }

    public String phoneNumOfSim() {
        System.out.println("Please neter number of sim");
        Scanner numofSimSc = new Scanner(System.in);
        String numofSim = numofSimSc.nextLine();
        while (numofSim.isEmpty()) {
            System.out.println("PLease enter number of sim");
            numofSim = numofSimSc.nextLine();
        }
        return numofSim;
    }

    public String phoneModel() {
        System.out.println("Please enter model of phone");
        Scanner modelSc = new Scanner(System.in);
        String model = modelSc.nextLine();
        while (model.isEmpty()) {
            System.err.println("Please enter phone model");
            model = modelSc.nextLine();
        }
        return model;
    }

    public void addPhoneToCol(Phones phones) {
        phoneHouse.add(phones);
    }

    public void removePhone(Phones phones) {
        phoneHouse.remove(phones);
    }

    public void printPhoneCol() {
        for (Object phone : phoneHouse) {
            System.out.println(phone);
        }
    }
}
