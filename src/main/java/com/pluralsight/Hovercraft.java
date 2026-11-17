package com.pluralsight;


public class Hovercraft extends Vehicle {
    // Only a hovercraft has this, so it lives here and not in Vehicle
    private int airCushionPressure;

    public Hovercraft(String model, int topSpeed, String color, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int airCushionPressure) {
        super(model, topSpeed, color, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    // An action only a hovercraft has
    public void hover() {
        System.out.println("Hovercraft is hovering.");
    }

}