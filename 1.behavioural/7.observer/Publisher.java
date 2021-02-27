public interface Publisher {

    public void subscribe(String event, Subscriber subscriber);

    public void unsubscribe(String event, Subscriber subscriber);

    public void notifySubscribers(String event, String data);

}
