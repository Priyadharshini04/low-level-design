package com.lld.patterns.creation.abstractfactory;


public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(FactoryType type)
    {
        AbstractVehicleFactory vehicleFactory = null;
        if(type.equals(FactoryType.CarFactory))
            vehicleFactory = new CarFactory();
        else if(type.equals(FactoryType.AutoFactory))
            vehicleFactory = new AutoFactory();
        else if(type.equals(FactoryType.BikeFactory))
            vehicleFactory = new BikeFactory();
        return vehicleFactory;
    }
}
