package org.launchcode;
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        double gas = input.nextDouble();
        input.close();

        double gasMileage = miles/gas;
        System.out.println("Your gas mileage is " + gasMileage + " miles per gallon.");
    }
}
