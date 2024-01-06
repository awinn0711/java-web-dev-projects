package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD (String title) {
        super(title);
        this.minRotationSpeed = 570;
        this.maxRotationSpeed = 1600;
        this.storageCapacity = 4700;
    }

    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of " + this.getMinRotationSpeed() + "-" + this.getMaxRotationSpeed()
                + " RPM.");
    }
    @Override
    public void readData() {
        System.out.println("The title of this DVD is " + this.getTitle());
    }
    @Override
    public void writeData(){
        System.out.println("Oops! This disc has already been written.");
    }
}
