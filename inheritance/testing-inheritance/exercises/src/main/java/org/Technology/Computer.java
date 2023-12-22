package org.Technology;

public class Computer extends AbstractEntity{
    private String brandName;
    private int yearOfManufacture;
    private boolean isShiny;

    public Computer(String aBrandName, int aYearOfManufacture, boolean shiny) {
        brandName = aBrandName;
        yearOfManufacture = aYearOfManufacture;
        isShiny = shiny;
    }

    public void noise() {
        System.out.println("Beep beep");
    }

    public String getBrandName() {
        return brandName;
    }


    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public boolean isShiny() {
        return isShiny;
    }

}
