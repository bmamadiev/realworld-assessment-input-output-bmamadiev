package com.kenzie.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NutritionsTest {
    @Test
    public void testCreateNutritionObject() {
        Nutritions nutrition = new Nutritions();
        nutrition.setCarbohydrates(15);
        nutrition.setCalories(100);
        nutrition.setProtein(3);
        nutrition.setFat(3);
        nutrition.setSugar(12);

        assertEquals(15, nutrition.getCarbohydrates());
        assertEquals(100, nutrition.getCalories());
        assertEquals(3, nutrition.getProtein());
        assertEquals(3, nutrition.getFat());
        assertEquals(12, nutrition.getSugar());
    }
}

