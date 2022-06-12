package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Car carA = new Car( "KS", 1584);
        Car carB = new Car("LA", 8262 );
        Car carC = new Car("MS", 9260 );
        Car carD = new Car("PA", 6259);
        Car carE = new Car("NM", 4781);

        VehicleInformation infoA = new VehicleInformation(1987, "white", "Volvo", 5000);
        VehicleInformation infoB = new VehicleInformation(1963, "black", "Mercedes Benz", 7000);
        VehicleInformation infoC = new VehicleInformation(2022, "yellow", "Tesla", 150000);
        VehicleInformation infoD = new VehicleInformation(2017, "red", "Ferrari", 67000);
        VehicleInformation infoE = new VehicleInformation(2020, "silver", "Chevrolet", 98000);

        Map<Car, VehicleInformation> register = new HashMap<>();
        register.put(carA, infoA);
        register.put(carB, infoB);
        register.put(carC, infoC);
        register.put(carD, infoD);
        register.put(carE, infoE);

        for (Map.Entry result : register.entrySet()) {
            System.out.println(result.getKey() + " " + result.getValue());
        }
    }
}