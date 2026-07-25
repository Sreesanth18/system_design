package com.sreesanth.parkinglot.model;

public class SmallParkingSpot extends ParkingSpot{
    public SmallParkingSpot(int id)
    {
        super(id, ParkingSpotSize.SMALL);
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.BIKE;
    }
}
