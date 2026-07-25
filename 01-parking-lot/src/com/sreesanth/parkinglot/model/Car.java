package com.sreesanth.parkinglot.model;

public class Car extends Vehicle{
    public Car(String registrationNumber) {
        super(registrationNumber, VehicleType.CAR);
    }
    
}
