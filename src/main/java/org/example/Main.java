package org.example;

// Base class representing a generic vehicle
class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    // Constructor to initialize vehicle attributes
    public Vehicle(int wheels, String col, float engine, String fuel) {
        this.numberOfWheels = wheels;
        this.color = col;
        this.engineSize = engine;
        this.fuelType = fuel;
    }

    // Getters and setters for encapsulation
    public int getNumberOfWheels() { return numberOfWheels; }
    public void setNumberOfWheels(int numberOfWheels) { this.numberOfWheels = numberOfWheels; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public float getEngineSize() { return engineSize; }
    public void setEngineSize(float engineSize) { this.engineSize = engineSize; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize + "L");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass representing a specific type of vehicle: Car
class Car extends Vehicle {
    private String brand;

    // Constructor that initializes both Vehicle and Car attributes
    public Car(int wheels, String col, float engine, String fuel, String brandName) {
        super(wheels, col, engine, fuel);
        this.brand = brandName;
    }

    // Getter and setter for brand
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    // Method to simulate honking
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Method to display car details, including inherited attributes
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}

// Main class to test Vehicle and Car objects
public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle instance
        Vehicle myVehicle = new Vehicle(4, "Red", 2.0f, "Gasoline");

        // Creating a Car instance
        Car myCar = new Car(4, "Blue", 3.5f, "Diesel", "Toyota");

        // Displaying vehicle details
        System.out.println("Vehicle Info:");
        myVehicle.displayInfo();

        // Displaying car details and testing honk method
        System.out.println("\nCar Info:");
        myCar.displayInfo();
        myCar.honk();
    }
}
