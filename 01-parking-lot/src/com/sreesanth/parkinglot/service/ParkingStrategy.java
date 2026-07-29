package com.sreesanth.parkinglot.service;

import com.sreesanth.parkinglot.model.ParkingLot;
import com.sreesanth.parkinglot.model.ParkingSpot;
import com.sreesanth.parkinglot.model.Vehicle;

public interface ParkingStrategy {

    ParkingSpot findParkingSpot(ParkingLot parkingLot, Vehicle vehicle);
}
