package Behavioral.Observer;

public interface IObservable {
    public void subscribe(IObserver observer);

    public void unSubscribe(IObserver observer);

    public void notifyAllSubscribers();
}
