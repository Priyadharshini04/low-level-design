package com.lld.patterns.creation.abstractfactory;

public class SportsBike extends Vehicle {
    @Override
    void setVehicleType() {
        vehicleType="Sports Bike";
    }

    @Override
    void setCostPerUnit() {
        costPerUnit=30;
    }
}
