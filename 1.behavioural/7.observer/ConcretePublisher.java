public class ConcretePublisher extends AbstractPublisher {

    private String text;

    public ConcretePublisher() {
    };

    public void setText(String text) {
        this.text = text;
        notifySubscribers("text changed", this.text);
    }
}
