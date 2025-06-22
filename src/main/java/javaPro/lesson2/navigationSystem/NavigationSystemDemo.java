package javaPro.lesson2.navigationSystem;

public class NavigationSystemDemo {

    public static void main(String[] args) {
        NavigationSystem carNav = new CarNavigationSystem("Moscow");
        NavigationSystem marineNav = new MarineNavigationSystem("Port of Saint Petersburg");

        carNav.displayStatus();
        carNav.startNavigation("Sochi");
        carNav.stopNavigation();

        System.out.println();

        marineNav.displayStatus();
        marineNav.startNavigation("Helsinki");
        marineNav.stopNavigation();
    }

}