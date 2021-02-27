public class ComponentDecoratorB extends ComponentDecorator {

    public ComponentDecoratorB(Component wrapee) {
        super(wrapee);
    }

    @Override
    public String execute() {
        return "Extra-behaviour B" + 
                "(" + super.execute() + ")";
    }
    
}
