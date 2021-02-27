public class ComponentDecoratorA extends ComponentDecorator {

    public ComponentDecoratorA(Component wrapee) {
        super(wrapee);
    }

    @Override
    public String execute() {
        return "Extra-behaviour A" + 
                "(" + super.execute() + ")";
    }
    
}
