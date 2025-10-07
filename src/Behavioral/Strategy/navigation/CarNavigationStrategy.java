package Behavioral.Strategy.navigation;

public class CarNavigationStrategy implements INavigationStrategy{
    @Override
    public void doNavigate(String navigationType) {
        System.out.println("Navigating by :" + navigationType);
    }
}
