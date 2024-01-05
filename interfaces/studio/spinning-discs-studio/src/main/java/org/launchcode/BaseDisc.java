package org.launchcode;

public abstract class BaseDisc {
    protected double storageCapacity;
    protected int minRotationSpeed;
    protected int maxRotationSpeed;
    private String title;

    public BaseDisc(String title) {
       this.title = title;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }
    public int getMinRotationSpeed() {
        return minRotationSpeed;
    }

    public int getMaxRotationSpeed() {
        return maxRotationSpeed;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
