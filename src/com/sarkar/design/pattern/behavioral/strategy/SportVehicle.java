package com.sarkar.design.pattern.behavioral.strategy;

import com.sarkar.design.pattern.behavioral.strategy.drivestrategy.SportVehicleDriveStrategy;

public class SportVehicle extends VehicleBase {

    SportVehicle() {
        super(new SportVehicleDriveStrategy());
    }

}
