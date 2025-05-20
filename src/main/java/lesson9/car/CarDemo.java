package lesson9.car;

public class CarDemo {

    public static void main(String[] args) {

        CarService carService = new CarService();
        carService.display();
        carService.scanner.close();
    }

}