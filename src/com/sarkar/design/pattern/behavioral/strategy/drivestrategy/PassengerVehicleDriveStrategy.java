package com.sarkar.design.pattern.behavioral.strategy.drivestrategy;

public class PassengerVehicleDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Drive Strategy for Passenger Vehicle");
    }
}
