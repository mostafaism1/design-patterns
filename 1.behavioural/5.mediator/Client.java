public class Client {

    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        ComponentA componentA = mediator.getComponentA();
        ComponentB componentB = mediator.getComponentB();

        componentB.setText("Hello");
        System.out.println(componentB.getText());

        componentA.clear();
        System.out.println(componentB.getText());

    }

}
