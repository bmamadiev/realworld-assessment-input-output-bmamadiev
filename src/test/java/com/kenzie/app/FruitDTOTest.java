package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FruitDTOTest {
    @Test
    public void testCreateFruitDTO(){
        Nutritions nutrition = new Nutritions();
        nutrition.setCarbohydrates(15);
        nutrition.setCalories(100);
        nutrition.setProtein(3);
        nutrition.setFat(3);
        nutrition.setSugar(12);

        FruitDTO fruitDTO = new FruitDTO();
        fruitDTO.setGenus("Fragaria");
        fruitDTO.setFamily("Rosaceae");
        fruitDTO.setName("Strawberry");
        fruitDTO.setId(1);
        fruitDTO.setOrder("Rosales");
        fruitDTO.setNutritions(nutrition);

        assertEquals("Fragaria", fruitDTO.getGenus());
        assertEquals("Rosaceae", fruitDTO.getFamily());
        assertEquals("Strawberry", fruitDTO.getName());
        assertEquals("Rosales", fruitDTO.getOrder());
        assertEquals(1, fruitDTO.getId());

        assertEquals(15, fruitDTO.getNutritions().getCarbohydrates());
        assertEquals(100, fruitDTO.getNutritions().getCalories());
        assertEquals(3, fruitDTO.getNutritions().getProtein());
        assertEquals(3, fruitDTO.getNutritions().getFat());
        assertEquals(12, fruitDTO.getNutritions().getSugar());
    }
}

