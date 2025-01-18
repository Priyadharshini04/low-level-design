package com.lld.patterns.creation.abstractfactory;

public interface AbstractVehicleFactory {
    Vehicle getVehicle(VehicleType vehicleType);
}
