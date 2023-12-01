package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Enter a positive number for your radius");
            while (!input.hasNextDouble()) {
                System.out.println("That's not a number");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);

    }
}
