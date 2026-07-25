package com.sreesanth.parkinglot.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.spots = new ArrayList<>();
    }

    public ParkingFloor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots != null ? spots : new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public void addSpot(ParkingSpot spot) {
        if (spot != null) {
            spots.add(spot);
        }
    }

    public void removeSpot(ParkingSpot spot) {
        spots.remove(spot);
    }

    public int getTotalSpots() {
        return spots.size();
    }

    public int getAvailableSpots() {
        int count = 0;
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                count++;
            }
        }
        return count;
    }

    public boolean isFull() {
        return getAvailableSpots() == 0;
    }
}