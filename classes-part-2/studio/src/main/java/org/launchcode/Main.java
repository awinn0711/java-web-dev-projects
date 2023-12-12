package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date dateUpdated = new Date();
        // write your code here
        MenuItem bakedPotato = new MenuItem(5.99, "A baked potato", "Appetizer", false);
//        System.out.println(bakedPotato.toString());
        MenuItem spaghetti = new MenuItem(10.99, "Spaghetti", "Entree", true);
        MenuItem cake = new MenuItem(6.99, "Cake", "Dessert", true);
        MenuItem pie = new MenuItem(5.99, "Pie","Dessert", false);
        MenuItem pie2 = new MenuItem(7.99, "Pie", "Dessert", true);

        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(bakedPotato);
        items.add(spaghetti);
        items.add(cake);

        Menu menu = new Menu(dateUpdated, items);
        menu.addItem(pie);
        System.out.println(menu);
        menu.addItem(pie2);
        System.out.println(menu);

        menu.removeItem(cake);
        System.out.println(menu);
    }
}
