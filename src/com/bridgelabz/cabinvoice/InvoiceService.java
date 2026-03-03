package com.bridgelabz.cabinvoice;

/*
 * InvoiceService fetches rides from repository
 * and generates invoice for user.
 */
public class InvoiceService {

    private RideRepository rideRepository = new RideRepository();
    private InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    // Adds rides for user
    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRides(userId, rides);
    }

    // Returns invoice summary for user
    public InvoiceSummary getInvoice(String userId) {
        return invoiceGenerator.generateInvoice(
                rideRepository.getRides(userId)
        );
    }
}