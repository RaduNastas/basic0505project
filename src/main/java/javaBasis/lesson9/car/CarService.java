package javaBasis.lesson9.car;

import java.util.Scanner;

public class CarService {

    Scanner scanner = new Scanner(System.in);

    public void display() {

        CarManufacturer manufacturer1 = createManufacturer();

        Car car1 = createNewCar(manufacturer1);
        System.out.println(car1);

        Car car2 = createNewCar(manufacturer1);
        System.out.println(car2);

        CarManufacturer manufacturer2 = createManufacturer();

        Car car3 = createNewCar(manufacturer2);
        System.out.println(car3);

    }

    private CarManufacturer createManufacturer() {

        System.out.println("Input manufacturer name: ");
        String manufacturer = scanner.nextLine();

        System.out.println("Input country name: ");
        String country = scanner.nextLine();

        return new CarManufacturer(manufacturer, country);
    }

    private Car createNewCar(CarManufacturer manufacturer) {

        System.out.println("Input model: ");
        String model = scanner.nextLine();

        System.out.println("Input color: ");
        String color = scanner.nextLine();

        return new Car(model, manufacturer, color);
    }

}