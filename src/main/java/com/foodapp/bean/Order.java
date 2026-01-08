package com.foodapp.bean;

public class Order {
    private int orderId;
    private String dishName;   // new field

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void showOrder() {
        System.out.println("Order placed with ID: " + orderId + " for dish: " + dishName);
    }
}