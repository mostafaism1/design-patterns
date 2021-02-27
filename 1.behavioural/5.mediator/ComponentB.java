public class ComponentB {

    private Mediator mediator;
    private String text;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
