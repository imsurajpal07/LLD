package Behavioral.Strategy.navigation;

public class NavigationContext {

    private INavigationStrategy navigationStrategy;

    public NavigationContext(INavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void doNavigate(String type) {
        navigationStrategy.doNavigate(type);
    }
}
