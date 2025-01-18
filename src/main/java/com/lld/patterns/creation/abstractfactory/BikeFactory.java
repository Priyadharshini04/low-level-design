package com.lld.patterns.creation.abstractfactory;

public class BikeFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle = null;
        if (vehicleType.equals(VehicleType.NormalBike)) {
            vehicle = new NormalBike();
        } else if (vehicleType.equals(VehicleType.SportsBike)) {
            vehicle = new SportsBike();
        }
        return vehicle;
    }
}
