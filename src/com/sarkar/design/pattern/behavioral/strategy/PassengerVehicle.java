package com.sarkar.design.pattern.behavioral.strategy;

import com.sarkar.design.pattern.behavioral.strategy.drivestrategy.PassengerVehicleDriveStrategy;

public class PassengerVehicle extends VehicleBase {

    PassengerVehicle() {
        super(new PassengerVehicleDriveStrategy());
    }

}
