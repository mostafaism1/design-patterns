public class ConcreteMediator implements Mediator {

    private ComponentA componentA;
    private ComponentB componentB;

    public ConcreteMediator() {
        this.componentA = new ComponentA(this);
        this.componentB = new ComponentB(this);
    }

    @Override
    public void notify(Object sender, String event) {
        if (sender == componentA) {
            if (event == "clear") {
                componentB.setText("");
            }
        }
    }

    @Override
    public ComponentA getComponentA() {
        return this.componentA;
    }

    @Override
    public ComponentB getComponentB() {
        return this.componentB;
    }

}
