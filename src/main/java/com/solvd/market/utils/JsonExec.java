package com.solvd.market.utils;

import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.market.shop.MilkProducts;
import org.apache.log4j.Logger;
import com.fasterxml.jackson.core.JsonProcessingException;


public class JsonExec{

    private  final static Logger LOGGER = Logger.getLogger(JsonExec.class);

    public String convertToJsonStr(Object obj){
        String jacksonStr = "";
        try {
            jacksonStr =  new ObjectMapper().writeValueAsString(obj);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return jacksonStr;
    }



public void convertJavaToJsonFile(Object obj, String path){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(Paths.get(path).toFile(),obj);
            LOGGER.info("write to file finished");
        }catch (JsonProcessingException e ){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

}

public MilkProducts convertToPojo(String jsonStr){

        MilkProducts milkProducts = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            milkProducts = objectMapper.readValue(jsonStr, MilkProducts.class);
            LOGGER.info("Convert to POJO finished");
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return milkProducts;
}

}

