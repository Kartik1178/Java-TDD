# Cab Invoice Generator

## Overview

Cab Invoice Generator is a subscription-based cab billing system.
It calculates fare based on distance, time, and ride category.

This project is implemented using Java and GitFlow methodology.
Each Use Case (UC1–UC5) was developed in a separate feature branch
and merged into develop before final release to master.

---

## Use Cases Implemented

### UC1 – Calculate Fare
Calculate fare for a single ride.
Cost = Rs.10 per km + Rs.1 per minute
Minimum Fare = Rs.5

---

### UC2 – Multiple Rides
Calculate aggregate total fare for multiple rides.

---

### UC3 – Enhanced Invoice
Generate Invoice Summary containing:
- Total Number of Rides
- Total Fare
- Average Fare per Ride

---

### UC4 – Invoice Service
Generate invoice based on userId.
Rides are fetched from RideRepository.

---

### UC5 – Premium Rides
System supports two categories:

Normal Ride:
- Rs.10 per km
- Rs.1 per minute
- Minimum Fare Rs.5

Premium Ride:
- Rs.15 per km
- Rs.2 per minute
- Minimum Fare Rs.20

---

## Project Structure

master  → Final release (README)
develop → Integrated features
feature/UCX-description → Individual use case branches

---

## Commit Format

All commits follow format:

[Kartikeya]: commit message

Example:
[Kartikeya]: Implemented UC3 enhanced invoice summary

---

## Technologies Used

- Java
- OOPS Principles
- GitFlow
- TDD Approach

---

## Author

Kartikeya Pusapati