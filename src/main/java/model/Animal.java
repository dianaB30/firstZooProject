package model;

import model.food.Diet;

public class Animal {

    protected String name;
    protected Diet diet;
    protected double menHours;

    public Animal(String name, Diet diet, double menHours) {
        this.name = name;
        this.diet = diet;
        this.menHours = menHours;
    }

    public String getName() {
        return name;
    }

    public double getMenHours() {
        return menHours;
    }
}
