public class Client {

    public static void main(String[] args) {
        ConcretePublisher publisher = new ConcretePublisher();

        Subscriber subscriberA = new ConcreteSubscriberA();
        Subscriber subscriberB = new ConcreteSubscriberB();

        publisher.subscribe("text changed", subscriberA);
        publisher.subscribe("text changed", subscriberB);

        publisher.setText("Publisher says Hello");

    }
}
