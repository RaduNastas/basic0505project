package javaPro.lesson2.device;

public class InputDeviceDemo {

    public static void main(String[] args) {
        InputDevice keyboard = new Keyboard("Logitech", "USB");
        InputDevice mouse = new Mouse("Razer", "Bluetooth");

        keyboard.displayInfo();
        keyboard.connect();
        keyboard.disconnect();

        System.out.println();

        mouse.displayInfo();
        mouse.connect();
        mouse.disconnect();
    }

}