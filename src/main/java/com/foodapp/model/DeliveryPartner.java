package com.foodapp.model;

public class DeliveryPartner {
    private String partnerName;

    public DeliveryPartner(String partnerName) {
        this.partnerName = partnerName;
    }

    public void deliver() {
        System.out.println("Delivered by: " + partnerName);
    }
}