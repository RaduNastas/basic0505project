package javaPro.lesson2.device;

public class Keyboard extends InputDevice {

    public Keyboard(String brand, String portType) {
        super(brand, portType);
    }

    @Override
    public void connect() {
        System.out.println("The keyboard is connected via " + portType);
    }

    @Override
    public void disconnect() {
        System.out.println("The keyboard is disabled.");
    }

}