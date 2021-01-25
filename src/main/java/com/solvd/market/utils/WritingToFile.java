package com.solvd.market.utils;

import com.solvd.market.shop.MilkProducts;

import java.io.*;

public class WritingToFile {

    public void WrToFile(String path,  String typeOfFood, String consoleName, String consoleExpDate, String quantity){
        File file = new File(path);

        try (BufferedWriter bufer = new BufferedWriter(new FileWriter(file, true))) {
            bufer.newLine();
            bufer.write("Type of food : "+ typeOfFood);
            bufer.newLine();
            bufer.write("Name     : "+consoleName);
            bufer.newLine();
            bufer.write("Expiry Date : "+consoleExpDate);
            bufer.newLine();
            bufer.write("Quantity   : "+quantity);
            bufer.newLine();
            bufer.newLine();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
