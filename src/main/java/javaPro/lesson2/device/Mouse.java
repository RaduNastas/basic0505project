package javaPro.lesson2.device;

public class Mouse extends InputDevice {

    public Mouse(String brand, String portType) {
        super(brand, portType);
    }

    @Override
    public void connect() {
        System.out.println("The mouse is connected via " + portType);
    }

    @Override
    public void disconnect() {
        System.out.println("The mouse is disabled.");
    }

}