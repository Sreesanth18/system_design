package com.sreesanth.parkinglot.model;

public class MediumParkingSpot extends ParkingSpot {

    public MediumParkingSpot(int id) {
        super(id, ParkingSpotSize.MEDIUM);
    }

    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == VehicleType.CAR;
    }

}
