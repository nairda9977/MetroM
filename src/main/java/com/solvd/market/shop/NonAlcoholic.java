package com.solvd.market.shop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.solvd.market.build.Warehouse;

public class NonAlcoholic extends Drink {
    Scanner name = new Scanner(System.in);
    private String name1;
    Scanner expDate = new Scanner(System.in);
    private String expDate1;
    Scanner addDrinkAgain = new Scanner(System.in);
    String addDrinkAgain1;
    Scanner answer = new Scanner(System.in);
    int answer1;
    private int protein;
    private int carbohydrate;
    private int kkal;

    List<Drink> fridge;

    public NonAlcoholic() {
        fridge = new LinkedList<Drink>();
    }

    public NonAlcoholic(String name1, String expDate1) {
        this.name1 = name1;
        this.expDate1 = expDate1;
    }

    public String toString() {
        return "Non Alcoholic : " + name1 + "    Expire Date is :" + expDate1;
    }

    public void addDrinkList()  {
        System.out.println("Add drink name please");
        name1 = name.nextLine();
        System.out.println("Add exp date please");
        expDate1 = expDate.nextLine();
        NonAlcoholic nonAlcoholic = new NonAlcoholic(name1, expDate1);
        addDrink(nonAlcoholic);
        System.out.println("Do you want to add non-Alcoholic drink ?(y/n)");
        addDrinkAgain1= addDrinkAgain.nextLine();
        if (addDrinkAgain1.equals("y")) {
            addDrinkList();
        }
        for(int i =0;i<=1;i++) {
            do {
                System.out.println("What to do next ?");
                System.out.println("1.Delete drink");
                System.out.println("2.Print drink list");
                System.out.println("3.Exit");
                System.out.println("4.Return to adding");
                answer1 = answer.nextInt();
            }
            while (answer1 != 1 && answer1 != 2 && answer1 != 3 && answer1 != 4);
            switch (answer1) {
                case 1:
                    removeDrink(nonAlcoholic);
                    break;
                case 2:
                    printDrinkList();
                    System.out.println("");
                    break;
                case 3:
                    System.exit(0);
                case 4:
                    addDrinkList();
                    break;
            }
        }
    }

    public void addDrink(Drink drink){
        fridge.add(drink);
    }

    public void removeDrink(Drink drink) {
        fridge.remove(drink);
    }

    public void printDrinkList() {
        for (Object drink : fridge) {
            System.out.println(drink);
        }
    }



    public void Kkal(int kkal) {
        this.kkal = kkal;
    }

    public int getKkal() {
        return kkal;
    }

    public void printInfo() {
        System.out.println("Name : " + getDrinkName());
        System.out.println("Protein " + protein + " gr");
        System.out.println("Carbohidrate " + carbohydrate + " gr");
        System.out.println("Kkal " + kkal);
    }

    public String toDrink() {
        return "toDrink";
    }
}
