package Behavioral.Observer;

public interface IObserver {
    void notifySubscriber(String channelName);

    String getUserName();
}
