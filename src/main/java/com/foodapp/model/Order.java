package com.foodapp.model;

public class Order {
    private int orderId;
    private String dishName;

    public Order(int orderId, String dishName) {
        this.orderId = orderId;
        this.dishName = dishName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getDishName() {
        return dishName;
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId + ", Dish: " + dishName);
    }
}