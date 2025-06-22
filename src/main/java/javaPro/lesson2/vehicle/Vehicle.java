package javaPro.lesson2.vehicle;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increment) {
        speed = speed + increment;
        System.out.println(brand + " accelerates to " + speed + " km/h");
    }

    public void brake(int decrement) {
        speed = Math.max(0, speed - decrement);
        System.out.println(brand + " slows down to " + speed + " km/h");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", speed: " + speed + " km/h");
    }

}