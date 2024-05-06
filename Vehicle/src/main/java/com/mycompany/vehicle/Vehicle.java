/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicle;

/**
 *
 * @author EYC
 */

//this is to demonstrate in Java concepts
// Base class Vehicle
public class Vehicle {
  private String make;
  private int year;

  //constructor vehicle
  public Vehicle(String make, int year) {
    this.make = make;
    this.year = year;
  }

  //method to display
  public void displayInfo() {
    System.out.println("Make: " + make + ", Year: " + year);
  }
}

//add interface FuelEfficiency
public interface FuelEfficiency {
    
  double calculateFuelEfficiency();
}

// Interface Performance
public interface Performance {
  double calculatePerformance();
}

//class Car (derived from Vehicle)
public class Car extends Vehicle implements FuelEfficiency
{
  private int numberOfDoors;
  
  private boolean isConvertible;

  public Car(String make, int year, int numberOfDoors, boolean isConvertible)
  {
    super(make, year);
    
    this.numberOfDoors = numberOfDoors;
    
    this.isConvertible = isConvertible;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Number of Doors: " + numberOfDoors + ", Is Convertible: " + isConvertible);
  }

  @Override
  public double calculateFuelEfficiency() {
    //in order to calculate fuel efficiency based on attributes
    return 0.0; // Implement the calculation logic here
  }
}

//class Motorcycle (derived from Vehicle)
public class Motorcycle extends Vehicle implements Performance {
  private String type;
  private int numberOfWheels;

  public Motorcycle(String make, int year, String type, int numberOfWheels) {
    super(make, year);
    
    this.type = type;
    this.numberOfWheels = numberOfWheels;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Type: " + type + ", Number of Wheels: " + numberOfWheels);
  }

  @Override
  public double calculatePerformance() {
        //calculate performance based on attributes
    return 0.0; // Implement the calculation logic here
  }
}

//class HybridVehicle (implements both Vehicle and FuelEfficiency)
public class HybridVehicle extends Vehicle implements FuelEfficiency {
  private double electricRange;

  public HybridVehicle(String make, int year, double electricRange) {
    super(make, year);
    this.electricRange = electricRange;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Electric Range: " + electricRange);
  }

  @Override
  public double calculateFuelEfficiency() {
    // Calculate fuel efficiency considering both fuel and electric efficiency
    return 0.0; // Implement the calculation logic here
  }
}

// Class HighPerformanceMotorcycle (implements both Vehicle and Performance)
public class HighPerformanceMotorcycle extends Motorcycle implements Performance {
  private double acceleration;

  public HighPerformanceMotorcycle(String make, int year, String type, int numberOfWheels, double acceleration) {
    super(make, year, type, numberOfWheels);
    this.acceleration = acceleration;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Acceleration: " + acceleration);
  }

  @Override
  public double calculatePerformance() {
    //calculate performance considering acceleration
    return 0.0; // Implement the calculation logic here; 0 return
  }
}

//main
public class Main {
  public static void main(String[] args) {
    //create objects of different classes
    Car car = new Car("Toyota", 2022, 4, true);
    Motorcycle motorcycle = new Motorcycle("Honda", 2020, "Sport", 2); //add motorcycle
    HybridVehicle hybridVehicle = new HybridVehicle("Tesla", 2021, 500.0);
    HighPerformanceMotorcycle highPerformanceMotorcycle = new HighPerformanceMotorcycle("Ducati", 2022, "Racing", 2, 0.0);

    //polymorphism by calling displayInfo on each object
    car.displayInfo();
    motorcycle.displayInfo();
    hybridVehicle.displayInfo();
    highPerformanceMotorcycle.displayInfo();

    //call methods from interfaces to showcase multiple inheritance
    System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency()); //calculate fuel efficiency for car
    System.out.println("Motorcycle Performance: " + motorcycle.calculatePerformance()); //motorcycle performance
    System.out.println("Hybrid Vehicle Fuel Efficiency: " + hybridVehicle.calculateFuelEfficiency());
    System.out.println("High Performance Motorcycle Performance: " + highPerformanceMotorcycle.calculatePerformance());
  }
}

int randomNumber = random.nextInt(100)
Scanner scanner = new Scanner (System.in)
