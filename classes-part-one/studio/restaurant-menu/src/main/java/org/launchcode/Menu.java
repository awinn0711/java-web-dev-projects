package org.launchcode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
public class Menu {
    public Date dateUpdated;
    public ArrayList<MenuItem> menuList;

    public Menu (ArrayList<MenuItem> menuList) {
        this.dateUpdated = new Date();
        this.menuList = menuList;
    }
}
