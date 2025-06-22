package javaPro.lesson2.navigationSystem;

public class CarNavigationSystem extends NavigationSystem {

    public CarNavigationSystem(String currentLocation) {
        super("Car Navigation System", currentLocation);
    }

    @Override
    public void startNavigation(String destination) {
        System.out.println(systemName + " has calculated a road route to " + destination + ".");
    }

    @Override
    public void stopNavigation() {
        System.out.println(systemName + " has stopped navigation.");
    }

}