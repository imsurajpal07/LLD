package Behavioral.Strategy.navigation;

public class WalkNavigationStrategy implements INavigationStrategy{
    @Override
    public void doNavigate(String navigationType) {
        System.out.println("Navigating by :" + navigationType);
    }
}
