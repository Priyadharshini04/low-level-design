package com.lld.patterns.creation.abstractfactory;

public abstract class Vehicle {
    String vehicleType;
    int costPerUnit;
    public void book(int distance) {
        setVehicleType();
        setCostPerUnit();
        System.out.println("You have booked "+vehicleType+" with the cost of "+costOfBooking(distance));
    }
    public int costOfBooking(int distance) {
        return costPerUnit*distance;
    }
    abstract void setVehicleType();
    abstract void setCostPerUnit();
}
