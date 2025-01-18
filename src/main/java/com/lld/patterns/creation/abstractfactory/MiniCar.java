package com.lld.patterns.creation.abstractfactory;

public class MiniCar extends Vehicle{
    @Override
    public void setVehicleType() {
        vehicleType = "Mini size Car";
    }

    @Override
    public void setCostPerUnit() {
        costPerUnit = 50;
    }
}
