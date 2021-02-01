package com.solvd.market;

import com.solvd.market.operation.Menu;
import com.solvd.market.operation.MenuFood;

import java.util.logging.Logger;

public class Executor {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.choseOption();
        MenuFood menuFood = new MenuFood();
        menuFood.readJsonConvertToPojo();

    }
}



