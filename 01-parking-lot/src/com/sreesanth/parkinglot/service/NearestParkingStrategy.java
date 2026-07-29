package com.sreesanth.parkinglot.service;

import com.sreesanth.parkinglot.model.ParkingFloor;
import com.sreesanth.parkinglot.model.ParkingLot;
import com.sreesanth.parkinglot.model.ParkingSpot;
import com.sreesanth.parkinglot.model.Vehicle;

public class NearestParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findParkingSpot(ParkingLot parkingLot, Vehicle vehicle) {

        for (ParkingFloor floor : parkingLot.getFloors()) {

            for (ParkingSpot spot : floor.getSpots()) {

                if (!spot.isOccupied() && spot.canFitVehicle(vehicle)) {
                    return spot;
                }
            }
        }

        return null;
    }
}
