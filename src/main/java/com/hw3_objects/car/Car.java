package main.java.com.hw3_objects.car;

public class Car {
    public String color;
    public String brand;
    public String model;

    public void startTheEngine() {
        System.out.println(color + " " + brand + " " + model + " Запуск двигуна");
    }

    public void rideSpeed(int speed) {

        System.out.println(color + " " + brand + " " + model + "їде зі швидкістю " + speed + " км/год");
    }

    public void stopTheEngine() {
        System.out.println(color + " " + brand + " " + model + " Зупинка двигуна");
    }
}