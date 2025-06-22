package javaBasis.lesson5.car;

public class CarDemo {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Volvo";
        car1.model = "XC 40";
        car1.year = 2019;
        car1.mileage = 20_000;

        System.out.println("Car brand is: " + car1.brand);
        System.out.println("Car model is: " + car1.model);
        System.out.println("Year of manufacture: " + car1.year);
        System.out.println("Car mileage are: " + car1.mileage);
        System.out.println();

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.model = "S 500";
        car2.year = 2000;
        car2.mileage = 120_000;

        System.out.println("Car brand is: " + car2.brand);
        System.out.println("Car model is: " + car2.model);
        System.out.println("Year of manufacture: " + car2.year);
        System.out.println("Car mileage are: " + car2.mileage);
    }

}