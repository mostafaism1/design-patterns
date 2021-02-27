public class Client {

    public static void main(String[] args) {

        Visitor visitor = new ConcreteVisitor();
        Element elementA = new ElementA();
        Element elementB = new ElementB();
        Element elementC = new ElementC();

        elementA.accept(visitor);
        elementB.accept(visitor);
        elementC.accept(visitor);
    }

}
