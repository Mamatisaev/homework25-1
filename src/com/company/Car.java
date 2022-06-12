package com.company;

public class Car {
    private int licencePlate;
    private String State;

    public Car(String state, int licencePlate) {
        this.licencePlate = licencePlate;
        State = state;
    }


    public String getState() {
        return State;
    }
    public int getLicencePlate() {
        return licencePlate;
    }

    @Override
    public String toString() {
        return "Car's " +
                "licence plate is " + licencePlate +
                ", State is " + State +
                ".";
    }
}
