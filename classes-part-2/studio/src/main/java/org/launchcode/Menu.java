package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item) {
        for (MenuItem i : this.items) {
            if (i.equals(item)) {
                System.out.println(item.getDescription() + " is a duplicate menu item");
                return;
            }
        }this.items.add(item);
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        ArrayList<String> menu = new ArrayList<>();
        String output = "\nMenu last updated on " + this.getLastUpdated() + "\n";
        for (MenuItem item : this.getItems()) {
            menu.add(item.toString());
        }
        for (String s : menu) {
            output += s;
        }
        return output;
    }
}


