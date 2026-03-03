package com.bridgelabz.cabinvoice;

import java.util.HashMap;
import java.util.Map;

/*
 * RideRepository stores rides mapped by userId.
 */
public class RideRepository {

    private Map<String, Ride[]> userRides = new HashMap<>();

    // Adds rides for a user
    public void addRides(String userId, Ride[] rides) {
        userRides.put(userId, rides);
    }

    // Returns rides for a user
    public Ride[] getRides(String userId) {
        return userRides.get(userId);
    }
}