package lesson8.light;

public class LightDemo {
    public static void main(String[] args) {

        LightService lightService = new LightService();
        System.out.println(lightService.createAndConfigureLight());
    }
}
