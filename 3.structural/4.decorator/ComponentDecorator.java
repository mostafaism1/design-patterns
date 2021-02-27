public abstract class ComponentDecorator implements Component {

    protected Component wrapee;

    public ComponentDecorator(Component wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String execute() {
        return wrapee.execute();
    }
    
}
