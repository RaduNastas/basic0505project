package javaPro.lesson2.navigationSystem;

public abstract class NavigationSystem {
    protected String systemName;
    protected String currentLocation;

    public NavigationSystem(String systemName, String currentLocation) {
        this.systemName = systemName;
        this.currentLocation = currentLocation;
    }

    public abstract void startNavigation(String destination);

    public abstract void stopNavigation();

    public void displayStatus() {
        System.out.println("System: " + systemName + ", Current location: " + currentLocation);
    }

}