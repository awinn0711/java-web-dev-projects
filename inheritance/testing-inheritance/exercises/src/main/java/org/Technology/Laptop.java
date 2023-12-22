package org.Technology;

public class Laptop extends Computer{
    public boolean wifi = true;

    public Laptop(String brandName, int yearOfManufacture, boolean isShiny) {
        super(brandName, yearOfManufacture, isShiny);
    }

    public boolean hasWifi() {
        return wifi;
    }
}
