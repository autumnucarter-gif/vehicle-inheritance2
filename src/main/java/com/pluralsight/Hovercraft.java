package com.pluralsight;


public class Hovercraft extends Vehicle {
    // Only a hovercraft has this, so it lives here and not in Vehicle
    private int airCushionPressure;

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