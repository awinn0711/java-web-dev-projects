package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem cake = new MenuItem("Cake", 5.99, "dessert", true);
        MenuItem steak = new MenuItem("Steak", 19.99, "Entree", false);
        MenuItem calimari = new MenuItem("Calimari", 9.99, "Appetizer", true);

        cake.setDescription("A slice of chocolate cake");
        steak.setDescription("Cooked to order");
        calimari.setDescription("Deep fried");

        ArrayList<MenuItem> menuList = new ArrayList<>();
        menuList.add(calimari);
        menuList.add(steak);
        menuList.add(cake);

        Menu newMenu = new Menu(menuList);

        System.out.println(newMenu.menuList.get(1).getName());


    }
}
