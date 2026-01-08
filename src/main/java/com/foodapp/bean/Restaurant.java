package com.foodapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private String name = "Spicy Tandoor";

    public void showRestaurant() {
        System.out.println("Restaurant: " + name);
    }

    public void confirmOrder() {
        System.out.println("Order accepted by " + name);
    }
}