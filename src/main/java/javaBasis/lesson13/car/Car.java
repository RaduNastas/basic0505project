package javaBasis.lesson13.car;

public class Car {

    private static int counter;
    private final int carNumber;
    private String producer;
    private String model;
    private int power;

    public Car(String producer, String model, int power) {
        counter++;
        this.carNumber = counter;
        this.producer = producer;
        this.model = model;
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format(
                "Car #%d:\nProducer: %s\nModel: %s\nPower: %d",
                carNumber, producer, model, power
        );
    }

}