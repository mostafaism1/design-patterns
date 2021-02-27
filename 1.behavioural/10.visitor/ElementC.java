public class ElementC implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementC(this);
    }
}
