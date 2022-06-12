package com.company;

public class VehicleInformation {
    private int yearOfManufacture;
    private String colour;
    private String brand;
    private int price;

    public VehicleInformation(int yearOfManufacture, String colour, String brand, int price) {
        this.yearOfManufacture = yearOfManufacture;
        this.colour = colour;
        this.brand = brand;
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "VehicleInformation - " +
                "year of manufacture is " + yearOfManufacture +
                ", colour is " + colour +
                ", brand is " + brand +
                ", price is $" + price +
                ".";
    }
}
