package com.sreesanth.parkinglot.model;

public abstract class ParkingSpot {

    private final int id;
    private final ParkingSpotSize size;
    private Vehicle vehicle;

    public ParkingSpot(int id, ParkingSpotSize size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public ParkingSpotSize getSize() {
        return size;
    }

    public boolean isOccupied() {
        return (vehicle != null);
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void removeVehicle() {
    this.vehicle = null;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);
}
