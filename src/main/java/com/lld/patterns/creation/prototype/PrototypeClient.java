package com.lld.patterns.creation.prototype;

public class PrototypeClient {
    public static void main(String[] args)
    {
        Vehicle car=new Car();
        car.setSeats(4);
        car.setColor("Blue");
        car.setFuel("Petrol");
        car.setTyres(4);

        Vehicle bike=new Bike();
        bike.setSeats(1);
        bike.setColor("Green");
        bike.setFuel("Petrol");
        bike.setTyres(2);

        System.out.println("Original object");
        System.out.println("Car: "+car.toString());
        System.out.println("Bike: "+bike.toString());

        Vehicle clonedCar=car.clone();
        Vehicle clonedBike=bike.clone();
        System.out.println("Cloned object");
        System.out.println("Car: "+clonedCar.toString());
        System.out.println("Bike: "+clonedBike.toString());

        clonedBike.setColor("Yellow");
        clonedCar.setColor("Grey");
        System.out.println("Original object");
        System.out.println("Car: "+car.toString());
        System.out.println("Bike: "+bike.toString());
        System.out.println("Cloned object");
        System.out.println("Car: "+clonedCar.toString());
        System.out.println("Bike: "+clonedBike.toString());
    }
}
