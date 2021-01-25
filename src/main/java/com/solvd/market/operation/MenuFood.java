package com.solvd.market.operation;

import com.solvd.market.shop.MeatProduct;
import com.solvd.market.shop.MilkProducts;
import com.solvd.market.utils.WritingToFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFood extends Menu {
        MilkProducts milkProducts = new MilkProducts();
    List<MilkProducts> milkList;
    List<MeatProduct> meatList;

    public MenuFood() {
        milkList = new ArrayList<MilkProducts>();
        meatList = new ArrayList<>();
    }
    public void typeOfProduct(){
        System.out.println("1.Work with MilkProduct");
        System.out.println("2.Work with MeatProduct");
        Scanner typeOfProductSc = new Scanner(System.in);
        int typeOfProduct = typeOfProductSc.nextInt();
        switch (typeOfProduct){
            case 1:
                addMilkProduct();
            case 2:
                addMeatProduct();
        }
    }
        String typeProd;
    public void addMilkProduct() {
        String typeOfFood = typeOfFood();
        String consoleName = consoleName();
        String consoleExpDate = consoleExpDate();
        String quantity = quantity();
        MilkProducts milkProducts = new MilkProducts(typeOfFood,consoleName, consoleExpDate, quantity);
        addMilkToList(milkProducts);
        findLocalStorage(typeOfFood,consoleName,consoleExpDate, quantity);
        System.out.println("Do you want to add again ?(y/n)");
        Scanner addAgain = new Scanner(System.in);
        if (addAgain.nextLine().equalsIgnoreCase("y")) {
            addMilkProduct();
        }
        for (int i = 0; i <= 1; i++) {
            int menuGetNumber = menu();
            switch (menuGetNumber) {
                case 1:
                    removeMilkProduct(milkProducts);
                    System.out.println("Meat is removed ");
                    break;
                case 2:
                    System.out.println("Milk list");
                    printMilkList();
                    break;

                case 3:
                    System.exit(0);
                    break;
                case 4:
                    addMilkProduct();
                    break;
            }
        }
    }

    public void addMeatProduct() {

        String typeOfFood = typeOfFood();
        String consoleName = consoleName();
        String consoleExpDate = consoleExpDate();
        String quantity = quantity();
        MeatProduct meatProduct = new MeatProduct(typeOfFood,consoleName, consoleExpDate, quantity);
        addMeatToList(meatProduct);
        findLocalStorage(typeOfFood,consoleName,consoleExpDate, quantity);
        System.out.println("Do you want to add again ?(y/n)");
        Scanner addAgain = new Scanner(System.in);
        if (addAgain.nextLine().equalsIgnoreCase("y")) {
            addMeatProduct();
        }
        for (int i = 0; i <= 1; i++) {
            int menuGetNumber = menu();
            switch (menuGetNumber) {
                case 1:
                    meatList.remove(meatProduct);
                    System.out.println("Meat is removed ");
                    break;
                case 2:
                    System.out.println("Milk list");
                    printMeatList();
                    break;

                case 3:
                    System.exit(0);
                    break;
                case 4:
                    addMilkProduct();
                    break;
            }
        }
    }

    public void findLocalStorage(String typeOfFood, String consoleName, String expDate, String quantity){
        if(typeOfFood.equalsIgnoreCase("milk")){
            WritingToFile wr = new WritingToFile();
            wr.WrToFile("C:/Users/user/Desktop/MilkProduct/MilkProduct.txt", typeOfFood, consoleName, expDate,quantity);
        }else if(typeOfFood.equalsIgnoreCase("chese")){
            WritingToFile wr = new WritingToFile();
            wr.WrToFile("C:/Users/user/Desktop/MilkProduct/CheseProduct.txt", typeOfFood, consoleName, expDate,quantity);
        }
    }

    public String typeOfFood(){
        System.out.println("Print plese type of product");
        System.out.println("Print, milk, chese, yourt");
        Scanner typeOfProductSc = new Scanner(System.in);
        String typeOfProduct = typeOfProductSc.nextLine();
        while(typeOfProduct.isEmpty()){
            System.out.println("Please input type of product");
            typeOfProduct=typeOfProductSc.nextLine();
        }
        return typeOfProduct;
    }

    public String consoleName() {
        Scanner nameSc = new Scanner(System.in);
        System.out.println("Print food name");
        String name = nameSc.nextLine();
        for (int limit = 0; limit <= 50; limit++) {
            if (name.isEmpty()) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Please enter food name");
                    name = nameSc.nextLine();
                } finally {
                    System.out.println("Thanks");
                }
            }
        }
        return name;
    }

    public String quantity(){
        System.out.println("Please enter quantity");
        Scanner quantitySc = new Scanner(System.in);
        String quantity = quantitySc.nextLine();
        while(quantity.isEmpty()){
            System.out.println("Please enter quantity");
            quantity= quantitySc.nextLine();
        }
        return quantity;
    }

    public String consoleExpDate() {
        System.out.println("Print exp. date");
        Scanner expDateSc = new Scanner(System.in);
        String expDate = expDateSc.nextLine();
        while (expDate.isEmpty()) {
            System.err.println("Please enter exp date");
            expDate = expDateSc.nextLine();
        }
        return expDate;
    }

    public void addMilkToList(MilkProducts milkProduct) {
        milkList.add(milkProduct);
    }

    public void removeMilkProduct(MilkProducts milkProducts) {
        this.milkList.remove(milkProducts);
    }

    public void printMilkList() {
        for (Object food : milkList) {
            System.out.println(food);
        }
    }
    public void addMeatToList(MeatProduct meatProduct){
        meatList.add(meatProduct);
    }

    public void removeMeatProduct(MeatProduct meatProduct){
        meatList.remove(meatProduct);
    }
    public void printMeatList() {
        for (Object food : meatList) {
            System.out.println(food);
        }
    }

    public String addProtein(){
        System.out.println("Add protein");
        Scanner addProteinSc = new Scanner(System.in);
        String addProtein = addProteinSc.nextLine();
        return addProtein;
    }

    public int menu() {
        System.out.println("What to do next ?, Chose a number");
        System.out.println("1.Delete  food ");
        System.out.println("2.Print food list");
        System.out.println("3.Exit");
        System.out.println("4.Retun to adding");
        Scanner menuAnswerSc = new Scanner(System.in);
        while (!menuAnswerSc.hasNextInt()) {
            System.out.println("Not a number");
            menuAnswerSc.next();
        }
        int menuAnswer = menuAnswerSc.nextInt();
        return menuAnswer;
    }
}
