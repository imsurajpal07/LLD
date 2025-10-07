package Behavioral.Observer;

public class Subscriber implements IObserver {

    private String userName;

    public Subscriber(String userName) {
        this.userName = userName;
    }


    @Override
    public void notifySubscriber(String channelName) {
        System.out.println("Notification sent to user: " + userName + " for channel: " + channelName);
    }

    @Override
    public String getUserName() {
        return userName;
    }
}
