public class Client {

    public static void main(String[] args) {

        AbstractClass ConcreteClassA = new ConcreteClassA();
        AbstractClass ConcreteClassB = new ConcreteClassB();

        System.out.println("calling the template method on ConcreteClass A");
        ConcreteClassA.templateMethod();

        System.out.println("\ncalling the template method on ConcreteClass B");
        ConcreteClassB.templateMethod();
    }

}
