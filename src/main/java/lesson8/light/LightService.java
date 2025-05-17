package lesson8.light;

import utils.InputReader;

import java.util.Scanner;

public class LightService {

    Scanner scanner = new Scanner(System.in);
    InputReader input = new InputReader(scanner);

    public void display() {

        Light light = createAndConfigureLight();
        System.out.println("Initial light status: \n" + light);

        updateBrightness(light);
        toggleLight(light);
        System.out.println("Updated light status: \n" + light);
    }

    private Light createAndConfigureLight() {

        String location = input.readText("Please input light location: ");
        String isOn = input.readText("Please turn light: on/off: ");
        int brightness = input.readInt("Please input light brightness 0–100: ");

        return new Light(location, isOn, brightness);
    }

    private void updateBrightness(Light light) {
        int brightness = input.readInt("Update light brightness 0–100: ");
        light.setBrightness(brightness);
    }

    private void toggleLight(Light light) {
        String onOff = input.readText("Please turn light: on/off: ");
        light.setOnOff(onOff);
    }

}