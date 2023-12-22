package org.Technology;

public class SmartPhone extends Computer {
    public int numCameras;
    public SmartPhone (String brandName, int yearOfManufacture, boolean isShiny, int numCameras) {
        super(brandName, yearOfManufacture, isShiny);
        this.numCameras = numCameras;
    }

    @Override
    public void noise() {
        System.out.println("Ring ring");
    }

}
