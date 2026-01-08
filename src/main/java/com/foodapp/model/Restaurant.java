package com.foodapp.model;

public class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void showRestaurant() {
        System.out.println("Restaurant: " + name);
    }
}