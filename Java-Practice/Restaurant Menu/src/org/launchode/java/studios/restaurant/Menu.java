package org.launchode.java.studios.restaurant;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItems> menuItems, Date dateUpdated){
        this.menuItems = new ArrayList<>();
        this.dateUpdated = dateUpdated;
    }


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    public static void main(String[] args) {
    }
}


