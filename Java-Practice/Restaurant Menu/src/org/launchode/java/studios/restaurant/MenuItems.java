package org.launchode.java.studios.restaurant;

public class MenuItems {
    private Double price;
    private String name;
    private String description;
    private String category;
    private Boolean newItem;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }

    public MenuItems(String name, String description, String category, Double price,Boolean newItem){
       name = this.name;
       description = this.description;
       category = this.category;
       price = this.price;
       newItem = this.newItem;
    }
}
