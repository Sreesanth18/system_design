package com.sreesanth.parkinglot.model;

public class LargeParkingSpot extends ParkingSpot{

    public LargeParkingSpot(int id) {
            super(id, ParkingSpotSize.LARGE);
    }
    
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.TRUCK;
    } 
}
