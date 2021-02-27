public interface Mediator {

    public void notify(Object sender, String event);

    // these 2 methods are only placed in the interface
    // so we can probe their state from the client code for testing purposes.
    public ComponentA getComponentA();

    public ComponentB getComponentB();
}