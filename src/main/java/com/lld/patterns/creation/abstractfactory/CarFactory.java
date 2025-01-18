package com.lld.patterns.creation.abstractfactory;

public class CarFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle=null;
        if(vehicleType.equals(VehicleType.MiniCar))
        {
            vehicle = new MiniCar();
        }
        else if(vehicleType.equals(VehicleType.MaxCar))
        {
            vehicle = new MaxCar();
        }
        return vehicle;
    }
}
