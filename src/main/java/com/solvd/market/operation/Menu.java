package com.solvd.market.operation;

import java.util.Scanner;

public class Menu {
    public void choseOption(){
        System.out.println("Chose Option");
        System.out.println("1.Work with Food");
        System.out.println("2.Work with Technik");
        Scanner optionSc = new Scanner(System.in);
        int option = optionSc.nextInt();
        switch (option){
            case 1:
                MenuFood food = new MenuFood();
                food.typeOfProduct();
                break;
            case 2:
                MenuTechnik technik = new MenuTechnik();
                technik.choseOption();
                break;
        }

    }







}
