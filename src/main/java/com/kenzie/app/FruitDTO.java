package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"genus", "name", "id", "family", "order", "nutritions"})
public class FruitDTO {
    @JsonProperty("genus")
    private String genus;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private int id;
    @JsonProperty("family")
    private String family;
    @JsonProperty("order")
    private String order;
    @JsonProperty("nutritions")
    private Nutritions nutritions;

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Nutritions getNutritions() {
        return nutritions;
    }

    public void setNutritions(Nutritions nutritions) {
        this.nutritions = nutritions;
    }

    @JsonPropertyOrder({"carbohydrates", "protein", "fat", "calories", "sugar"})
    public static class Nutritions {
        @JsonProperty("carbohydrates")
        private double carbohydrates;
        @JsonProperty("protein")
        private double protein;
        @JsonProperty("fat")
        private double fat;
        @JsonProperty("calories")
        private double calories;
        @JsonProperty("sugar")
        private double sugar;

        public double getCarbohydrates() {
            return carbohydrates;
        }

        public void setCarbohydrates(double carbohydrates) {
            this.carbohydrates = carbohydrates;
        }

        public double getProtein() {
            return protein;
        }

        public void setProtein(double protein) {
            this.protein = protein;
        }

        public double getFat() {
            return fat;
        }

        public void setFat(double fat) {
            this.fat = fat;
        }

        public double getCalories() {
            return calories;
        }

        public void setCalories(double calories) {
            this.calories = calories;
        }

        public double getSugar() {
            return sugar;
        }

        public void setSugar(double sugar) {
            this.sugar = sugar;
        }

        @Override
        public String toString() {
            return "Nutritions{" +
                    "carbohydrates=" + carbohydrates +
                    ", protein=" + protein +
                    ", fat=" + fat +
                    ", calories=" + calories +
                    ", sugar=" + sugar +
                    '}';
        }
    }
    // TODO: use DTO Generator to fill in getters and setters for FruitDTO and Nutritions
    // make sure to remove "abstract" from the FruitDTO class definition

    @Override
    public String toString() {
        return "FruitDTO{" +
                "genus='" + genus + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", family='" + family + '\'' +
                ", order='" + order + '\'' +
                ", nutritions=" + nutritions.toString() +
                '}';
    }
}
