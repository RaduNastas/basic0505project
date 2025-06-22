package javaPro.lesson2.navigationSystem;

public class MarineNavigationSystem extends NavigationSystem {

    public MarineNavigationSystem(String currentLocation) {
        super("Marine Navigation System", currentLocation);
    }

    @Override
    public void startNavigation(String destination) {
        System.out.println(systemName + " has started a marine route to " + destination + ".");
    }

    @Override
    public void stopNavigation() {
        System.out.println(systemName + " has stopped marine navigation.");
    }

}