public class ConcreteVisitor implements Visitor {

    @Override
    public void visitElementA(ElementA elementA) {
        System.out.println("visiting A");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        System.out.println("visiting B");

    }

    @Override
    public void visitElementC(ElementC elementC) {
        System.out.println("visiting C");

    }
    
}
