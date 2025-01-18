package com.lld.patterns.creation.abstractfactory;

public class MaxCar extends Vehicle {
    @Override
    public void setVehicleType() {
        vehicleType="Max size Car";
    }

    @Override
    public void setCostPerUnit() {
        costPerUnit=60;
    }
}
