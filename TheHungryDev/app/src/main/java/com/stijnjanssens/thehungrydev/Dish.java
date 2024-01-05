package com.stijnjanssens.thehungrydev;

public class Dish {
    private String title;
    private String description;
    private double price;


    public Dish(String title, double price) {
        this.title = title;
        this.description = "no description available";
        this.price = price;
    }

    public Dish(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return getTitle();
    }
}
