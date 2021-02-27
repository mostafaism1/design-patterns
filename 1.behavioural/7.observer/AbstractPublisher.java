import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractPublisher implements Publisher {

    private Map<String, List<Subscriber>> subscribers;

    public AbstractPublisher() {
        subscribers = new HashMap<>();
    }

    @Override
    public void subscribe(String event, Subscriber subscriber) {

        if (!subscribers.containsKey(event)) {
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            subscribers.put(event, list);
        } else {
            subscribers.get(event).add(subscriber);
        }
    }

    @Override
    public void unsubscribe(String event, Subscriber subscriber) {
        subscribers.get(event).remove(subscriber);
    }

    @Override
    public void notifySubscribers(String event, String data) {
        for (Subscriber subscriber : this.subscribers.get(event)) {
            subscriber.update(data);
        }
    }

}
