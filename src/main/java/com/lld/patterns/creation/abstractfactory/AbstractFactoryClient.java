package com.lld.patterns.creation.abstractfactory;

public class AbstractFactoryClient {
    public static void main(String[] args)
    {
        AbstractVehicleFactory vehicleFactory=FactoryProvider.getVehicleFactory(FactoryType.CarFactory);
        Vehicle vehicle=vehicleFactory.getVehicle(VehicleType.MiniCar);
        vehicle.book(10);

        AbstractVehicleFactory vehicleFactory1=FactoryProvider.getVehicleFactory(FactoryType.BikeFactory);
        Vehicle vehicle1=vehicleFactory1.getVehicle(VehicleType.SportsBike);
        vehicle1.book(10);

    }
}
