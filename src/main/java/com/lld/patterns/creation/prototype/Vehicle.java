package com.lld.patterns.creation.prototype;

public abstract class Vehicle {
    protected int seats;
    protected int tyres;
    protected String color;
    protected String fuel;

    public Vehicle() {
    }

    public Vehicle(Vehicle v) {
        if(v!=null)
        {
            this.seats = v.seats;
            this.tyres = v.tyres;
            this.color = v.color;
            this.fuel = v.fuel;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    // can override Object clone method here instead of creating new one. But should be aware of mutable field changes in obj.
    public abstract Vehicle clone();

    @Override
    public String toString()
    {
        return "Seats: " + this.seats + "Tyres: " + this.tyres + "Color: " + this.color + "Fuel: " + this.fuel ;
    }
}
