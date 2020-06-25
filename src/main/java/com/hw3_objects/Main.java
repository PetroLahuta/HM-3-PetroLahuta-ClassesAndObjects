package main.java.com.hw3_objects;

import main.java.com.hw3_objects.car.Car;
import main.java.com.hw3_objects.circle.Circle;
import main.java.com.hw3_objects.objcount.ObjCount;

public class Main {
    public static final int RADIUS = 21;

    public static void main(String[] args) {
        Circle circle = new Circle(RADIUS);
        System.out.println(circle);

        new ObjCount();
        new ObjCount();
        new ObjCount();
        new ObjCount();
        new ObjCount();
        System.out.println("Кількість класів: " + ObjCount.getCount());

        Car car1 = new Car();
        car1.color = "Black";
        car1.brand = "Toyota";
        car1.model = "Land Cruiser Prado";

        car1.startTheEngine();
        car1.rideSpeed(68);
        car1.stopTheEngine();
    }
}
