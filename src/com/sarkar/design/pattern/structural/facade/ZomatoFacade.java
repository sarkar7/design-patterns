package com.sarkar.design.pattern.structural.facade;

public class ZomatoFacade {

    private Restaurant restaurant;

    private DeliveryTeam deliveryTeam;

    private DeliveryBoy deliveryBoy;


    public void placeOrder() {
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }

}
