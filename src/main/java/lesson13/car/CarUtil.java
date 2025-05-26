package lesson13.car;

import lesson12.utils.UserInputStaticScanner;

public class CarUtil {

    public void displayInfo() {
        int numberOfCars = UserInputStaticScanner.inputInt("How many cars you want to input? ");
        int carCounter = 0;

        while (carCounter < numberOfCars) {
            Car car = createNewCar();
            System.out.println(car);
            carCounter++;
        }
    }

    private static Car createNewCar() {
        String producer = UserInputStaticScanner.inputText("Input producer: ");
        String model = UserInputStaticScanner.inputText("Input model: ");
        int power = UserInputStaticScanner.inputInt("Input power: ");

        return new Car(producer, model, power);
    }

}