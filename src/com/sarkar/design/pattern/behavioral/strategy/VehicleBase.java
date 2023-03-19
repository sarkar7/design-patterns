package com.sarkar.design.pattern.behavioral.strategy;

import com.sarkar.design.pattern.behavioral.strategy.drivestrategy.DriveStrategy;

public class VehicleBase {

    DriveStrategy strategy;

    VehicleBase(DriveStrategy driverStrategy) {
        this.strategy = driverStrategy;
    }

    public void drive() {
        strategy.drive();
    }

}
