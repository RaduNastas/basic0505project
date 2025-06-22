package javaBasis.lesson7.car;

import javaBasis.utils.InputReader;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        InputReader inputCar = new InputReader(scanner);

        String brand = inputCar.readText("Input brand: ");
        String model = inputCar.readText("Input model: ");
        double fuelConsumption = inputCar.readDouble("Input fuel consumption: ");
        double fuelTankCapacity = inputCar.readDouble("Input double fuel tank capacity: ");

        Car car = new Car(brand, model, fuelConsumption, fuelTankCapacity);
        System.out.println(car);

        double newFuelConsumption = inputCar.readDouble("Input new fuel consumption: ");
        car.setFuelConsumption(newFuelConsumption);
        System.out.println(car);
        scanner.close();
    }

}