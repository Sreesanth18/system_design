package com.sreesanth.parkinglot.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private String name;
    private String address;
    private List<ParkingFloor> floors;

    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
        this.floors = new ArrayList<>();
    }

    public ParkingLot(String name, String address, List<ParkingFloor> floors) {
        this.name = name;
        this.address = address;
        this.floors = floors != null ? floors : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public void addFloor(ParkingFloor floor) {
        if (floor != null) {
            floors.add(floor);
        }
    }

    public void removeFloor(ParkingFloor floor) {
        floors.remove(floor);
    }

    public ParkingFloor getFloor(int floorNumber) {
        for (ParkingFloor floor : floors) {
            if (floor.getFloorNumber() == floorNumber) {
                return floor;
            }
        }
        return null;
    }

    public int getTotalFloors() {
        return floors.size();
    }

    public int getTotalSpots() {
        int total = 0;
        for (ParkingFloor floor : floors) {
            total += floor.getTotalSpots();
        }
        return total;
    }

    public int getAvailableSpots() {
        int available = 0;
        for (ParkingFloor floor : floors) {
            available += floor.getAvailableSpots();
        }
        return available;
    }

    public boolean isFull() {
        return getAvailableSpots() == 0;
    }
}