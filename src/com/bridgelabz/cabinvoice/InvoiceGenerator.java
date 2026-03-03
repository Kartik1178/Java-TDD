/*
 * InvoiceGenerator handles fare calculation
 * for single and multiple rides.
 */
package com.bridgelabz.cabinvoice;
/*
 * InvoiceGenerator handles fare calculation
 * for single and multiple rides.
 */
public class InvoiceGenerator {

    private static final int COST_PER_KM = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_FARE = 5;

    // Calculates fare for single ride
    public double calculateFare(double distance, int time) {
        double fare = distance * COST_PER_KM + time * COST_PER_MINUTE;
        return Math.max(fare, MINIMUM_FARE);
    }

    // Calculates total fare for multiple rides
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }
    // Generates invoice summary
    public InvoiceSummary generateInvoice(Ride[] rides) {
        double totalFare = calculateFare(rides);
        return new InvoiceSummary(rides.length, totalFare);
    }
}