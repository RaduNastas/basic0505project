package javaPro.lesson2.vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public void openDoor(int door) {
        if (door > 0 && door <= numberOfDoors) {
            System.out.println("Door " + door + " is open");
        } else {
            System.out.println("There is no such door");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }

}