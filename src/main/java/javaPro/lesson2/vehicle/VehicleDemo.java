package javaPro.lesson2.vehicle;

public class VehicleDemo {

    public static void main(String[] args) {
        Car car = new Car("Toyota", 60, 4);
        car.displayInfo();
        car.accelerate(20);
        car.brake(15);
        car.openDoor(2);

        System.out.println();

        Bicycle bike = new Bicycle("Trek", 15, true);
        bike.displayInfo();
        bike.ringBell();
        bike.brake(5);
    }

}