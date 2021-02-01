package com.solvd.market.operation;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Menu {
    private final static Logger LOGGER = Logger.getLogger(MenuFood.class);
    public void choseOption(){
        System.out.println("Chose Option");
        System.out.println("1.Work with Food");
        System.out.println("2.Work with Technik");
        Scanner optionSc = new Scanner(System.in);
        int option = optionSc.nextInt();
        switch (option){
            case 1:
                LOGGER.info("Start work with food");
                MenuFood food = new MenuFood();
                food.typeOfProduct();
                break;
            case 2:
                LOGGER.info("Start work with technic");
                MenuTechnik technik = new MenuTechnik();
                technik.choseOption();
                break;
        }

    }







}
