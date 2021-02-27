public class ComponentA {

    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void clear() {
        mediator.notify(this, "clear");
    }

}
