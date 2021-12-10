package com.kenzie.app;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URL;
import java.util.List;

// import necessary libraries

enum FruitCriteria {
    ALL,
    LOW_CARB,
    HIGH_CALORIE
}

public class Main {
    public static String getDesiredURL(FruitCriteria fc){
        switch(fc){
            case ALL:
                // look through the documentation to determine the correct URL
            case LOW_CARB:
                // look through the documentation to determine the correct URL
            case HIGH_CALORIE:
                // look through the documentation to determine the correct URL
            default:
                return "";
        }
    }

    public static List<FruitDTO> getFruits(FruitCriteria fc) throws IOException {
        String desiredURL = getDesiredURL(fc);
        URL URLobject = new URL(desiredURL);
        // TODO: make the GET request and return the list of FruitDTOs
        // the criteria is already covered for you
    }

    public static String addNewFruit(FruitDTO fruit) throws IOException {
        URL URLobject = new URL("https://www.fruityvice.com/api/fruit");
        // TODO: turn the DTO into JSON, make a PUT request with the data, and return the response
    }

    public static FruitDTO createFruitDTO(){
        // TODO: create a sample FruitDTO object based on what you want to send in your PUT request
        // instantiate a new FruitDTO object and a new Nutritions DTO object
        // then fill in the properties for each item with the setter methods
    }

    public static void main(String[] args) throws IOException {
        // do not change code in main()
        List<FruitDTO> allFruits = getFruits(FruitCriteria.ALL);
        for(FruitDTO fruit : allFruits){
            System.out.println(fruit.toString());
        }

        System.out.println(addNewFruit(createFruitDTO()));
    }
}
