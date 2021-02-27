public class ConcreteSubscriberA implements Subscriber {

    @Override
    public void update(String data) {
        System.out.println("At SubscriberA:" + data);
    }
}
