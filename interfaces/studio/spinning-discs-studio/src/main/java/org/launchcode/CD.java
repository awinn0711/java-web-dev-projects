package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String title) {
        super(title);
        this.storageCapacity = 700;
        this.minRotationSpeed = 200;
        this.maxRotationSpeed = 500;
    }

    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of " + this.getMinRotationSpeed() + "-" + this.getMaxRotationSpeed()
        + " RPM.");
    }
    @Override
    public void readData() {

    }
    @Override
    public void writeData(){

    }
}
