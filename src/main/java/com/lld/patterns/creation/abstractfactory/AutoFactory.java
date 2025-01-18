package com.lld.patterns.creation.abstractfactory;

public class AutoFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        Vehicle vehicle=null;
        if(vehicleType.equals(VehicleType.PersonalAuto))
        {
            vehicle = new PersonalAuto();
        }
        else if(vehicleType.equals(VehicleType.ShareAuto))
        {
            vehicle = new ShareAuto();
        }
        return vehicle;
    }
}
