package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD newCD = new CD("A cool CD");
        DVD newDVD = new DVD("A super rad movie");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        newCD.spinDisc();
        newCD.readData();
        newCD.writeData();

        newDVD.spinDisc();
        newDVD.readData();
        newDVD.writeData();

    }
}