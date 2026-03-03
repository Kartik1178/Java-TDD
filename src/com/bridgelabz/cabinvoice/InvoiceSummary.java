package com.bridgelabz.cabinvoice;

/*
 * InvoiceSummary stores aggregated invoice data
 * including total rides, total fare and average.
 */
public class InvoiceSummary {

    private int totalRides;
    private double totalFare;

    // Constructor initializes summary
    public InvoiceSummary(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
    }

    // Returns total rides
    public int getTotalRides() {
        return totalRides;
    }

    // Returns total fare
    public double getTotalFare() {
        return totalFare;
    }

    // Returns average fare per ride
    public double getAverageFare() {
        return totalFare / totalRides;
    }
}