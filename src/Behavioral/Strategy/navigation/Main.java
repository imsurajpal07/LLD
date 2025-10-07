package Behavioral.Strategy.navigation;

public class Main {
    public static void main(String[] args) {
        NavigationContext carNavigation = new NavigationContext(new CarNavigationStrategy());
        NavigationContext walkNavigation = new NavigationContext(new WalkNavigationStrategy());
        carNavigation.doNavigate("car");
        walkNavigation.doNavigate("walk");
        NavigationContext bikeNavigation = new NavigationContext(new BikeNavigationStrategy());
        bikeNavigation.doNavigate("Bike");
    }
}
