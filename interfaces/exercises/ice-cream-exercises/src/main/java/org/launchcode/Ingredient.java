package org.launchcode;

import java.util.ArrayList;

public abstract class Ingredient {
    private String name;
    private Double cost;
    private ArrayList<String> allergens;

    public Ingredient(String aName, double aCost, ArrayList<String> someAllergens){
        name = aName;
        cost = aCost;
        allergens = someAllergens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Cost: $" + cost + "\n" +
                "Allergens: " + allergens + "\n";
    }
}
