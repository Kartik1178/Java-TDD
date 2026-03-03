package com.bridgelabz.cabinvoice;
/*
 * Ride class represents a single cab ride.
 * It stores distance and time travelled.
 */
public class Ride {

    private double distance;
    private int time;

    // Constructor initializes ride details
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    // Returns distance
    public double getDistance() {
        return distance;
    }

    // Returns time
    public int getTime() {
        return time;
    }
}