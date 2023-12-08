package org.launchcode;
import java.util.Date;
public class MenuItem {
    public String name;
    public double price;
   public String description;
    public String category;
   public boolean isNew;

    public MenuItem(String name, double price, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
}
