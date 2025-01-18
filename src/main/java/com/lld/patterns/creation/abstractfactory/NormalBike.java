package com.lld.patterns.creation.abstractfactory;

public class NormalBike extends Vehicle {
    @Override
    void setVehicleType() {
        vehicleType="Normal Bike";
    }

    @Override
    void setCostPerUnit() {
        costPerUnit=10;
    }
}
