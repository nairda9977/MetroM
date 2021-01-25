package com.solvd.market.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFile {

    public String readingFromFile(String path){
        File file = new File(path);
        Scanner scan;
        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return "default";

    }
}
