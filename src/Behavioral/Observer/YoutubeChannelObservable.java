package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelObservable implements IObservable {

    private String channelName;
    private List<IObserver> observerList;

    public YoutubeChannelObservable(String channelName) {
        this.channelName = channelName;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void subscribe(IObserver observer) {
        observerList.add(observer);
        System.out.println(observer.getUserName() + " has subscribed to user channel: " + channelName);
    }

    @Override
    public void unSubscribe(IObserver observer) {
        observerList.remove(observer);
        System.out.println(observer.getUserName() + " has unsubscribed the channel: " + channelName);
    }

    @Override
    public void notifyAllSubscribers() {
        for (IObserver observer : observerList) {
            observer.notifySubscriber(channelName);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " has uploaded a video : " + videoTitle);
        notifyAllSubscribers();
    }
}
