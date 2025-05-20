package lesson9.car;

public class Car {

    private final String model;
    private final CarManufacturer manufacturer;
    private final String color;

    public Car(String model, CarManufacturer manufacturer, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public CarManufacturer getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format(
                "%sCar model: %s\nCar color: %s\n", manufacturer, model, color);
    }

}