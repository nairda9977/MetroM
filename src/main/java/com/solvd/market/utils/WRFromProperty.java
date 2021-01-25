package com.solvd.market.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WRFromProperty {
    public String getProperty(String path, String key){
        Properties properties = new Properties();
        FileInputStream file =  null;
        try {
            file = new FileInputStream(path);
            properties.load(file);
            return properties.getProperty(key);
        }catch (IOException e){
            e.printStackTrace();
        }
        return "default";
    }




    public void writeToProperty(String path, String key, String value){
        Properties properties = new Properties();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            properties.setProperty(key, value);
            properties.store(fileOutputStream, "");
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}
