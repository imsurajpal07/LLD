package Behavioral.Strategy.navigation;

public class BikeNavigationStrategy implements INavigationStrategy{
    @Override
    public void doNavigate(String navigationType) {
        System.out.println("Navigating by: " + navigationType);
    }
}
