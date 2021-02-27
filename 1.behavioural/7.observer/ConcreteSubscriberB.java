public class ConcreteSubscriberB implements Subscriber {

    @Override
    public void update(String data) {
        System.out.println("At SubscriberB:" + data);
    }

}
