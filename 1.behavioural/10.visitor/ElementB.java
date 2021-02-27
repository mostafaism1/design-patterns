public class ElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
}
