package javaPro.lesson2.device;

public abstract class InputDevice {
    protected String brand;
    protected String portType;

    public InputDevice(String brand, String portType) {
        this.brand = brand;
        this.portType = portType;
    }

    public abstract void connect();

    public abstract void disconnect();

    public void displayInfo() {
        System.out.println("Device: " + this.getClass().getSimpleName() +
                ", Brand: " + brand + ", Port: " + portType);
    }

}