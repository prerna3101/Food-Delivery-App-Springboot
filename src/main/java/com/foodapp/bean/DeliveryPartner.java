package com.foodapp.bean;

public class DeliveryPartner {
    private String partnerName;

    public DeliveryPartner(String partnerName) {
        this.partnerName = partnerName;
    }

    public void deliverOrder() {
        System.out.println("Order delivered by " + partnerName);
    }
}