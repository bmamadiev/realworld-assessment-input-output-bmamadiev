package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;

@JsonPropertyOrder({"carbohydrates", "protein", "fat", "calories", "sugar"})
class Nutritions {
    // TODO: fill in properties, getters, and setters for Nutritions to go into FruitDTO
}


@JsonPropertyOrder({"genus", "name", "id", "family", "order", "nutritions"})
public class FruitDTO {
    // TODO: fill in properties, getters, and setters for FruitDTO

    public String toJSON() throws JsonProcessingException {
        // TODO: convert FruitDTO to JSON string
        return "";
    }
}
