package org.example;

public class Vehicle {
    String name;
    double fuelLevel;
    double mileage;
    double totalTravelDistance;
    double maxSpeed;
    boolean damaged;
    String color;

    public  double accelerate(double speed,double durationInHours){

        System.out.println(name+ "is accelerating with "+speed +" km/h for "+ durationInHours+" h");
        double distance=speed*durationInHours;
        totalTravelDistance=totalTravelDistance+distance;
        System.out.println("Total travel distance is "+name +":"+totalTravelDistance);
        double usedFuel=distance*mileage/100;
        fuelLevel=fuelLevel-usedFuel;
        System.out.println("Remainig travel distance is "+name+":"+fuelLevel);

        return distance;
    }
}
