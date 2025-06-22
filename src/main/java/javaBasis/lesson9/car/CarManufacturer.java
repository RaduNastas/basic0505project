package javaBasis.lesson9.car;

public record CarManufacturer(String name, String country) {

    @Override
    public String toString() {
        return String.format("Manufacturer name: %s\nManufacturer country: %s\n", name, country);
    }

}