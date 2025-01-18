package com.lld.patterns.creation.abstractfactory;

public class PersonalAuto extends Vehicle {

    @Override
    void setVehicleType() {
        vehicleType="Personal Auto";
    }

    @Override
    void setCostPerUnit() {
        costPerUnit=30;
    }
}
