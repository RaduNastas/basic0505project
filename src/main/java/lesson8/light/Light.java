package lesson8.light;

public class Light {

    String location;
    String onOff;
    int brightness;

    public Light(String location, String onOff, int brightness) {
        this.location = location;
        this.onOff = onOff;
        this.brightness = brightness;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getOnOff() {
        return onOff;
    }

    public void setOnOff(String onOff) {
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return String.format("Light location: %s\nLight brightness: %d\nLight is on/off: %s\n", location, brightness, onOff);
    }

}