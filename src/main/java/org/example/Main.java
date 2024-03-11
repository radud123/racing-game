package org.example;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car carReference = new Car();
        carReference.name="Ferrari";
        carReference.maxSpeed=300;
        carReference.fuelLevel=60;
        carReference.mileage=12.50;
        carReference.totalTravelDistance=0;
        carReference.damaged=false;
        carReference.doorCount=1;
        carReference.color="Red";
        System.out.println("Properties of car "+ carReference.name);
        //System.out.println(q);
    Car car2= new Car();
    car2.name="mazda";
    car2.maxSpeed=200;
    car2.fuelLevel=50;
    car2.damaged=true;
        System.out.println("Properties of car "+ car2.name);
        System.out.println("Max speed "+car2.maxSpeed);
        System.out.println("Fuel Level "+car2.fuelLevel);
        System.out.println("Damage "+car2.damaged);
        double distanceForCar1=carReference.accelerate(60,1);
        double distanceForCar2=car2.accelerate(100,1);
        //System.out.println("");

    }
}
