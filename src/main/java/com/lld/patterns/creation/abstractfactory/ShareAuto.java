package com.lld.patterns.creation.abstractfactory;

public class ShareAuto extends Vehicle {
    @Override
    void setVehicleType() {
        vehicleType="Share Auto";
    }

    @Override
    void setCostPerUnit() {
        costPerUnit=10;
    }
}
