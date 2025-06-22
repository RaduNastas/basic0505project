package javaPro.lesson2.vehicle;

public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String brand, int speed, boolean hasBell) {
        super(brand, speed);
        this.hasBell = hasBell;
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println(" Dzyn-dzyn!");
        } else {
            System.out.println("No bell");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is there a bell: " + (hasBell ? "Yes" : "Not"));
    }

}