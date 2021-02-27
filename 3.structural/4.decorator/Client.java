public class Client {

    public static void main(String[] args) {

        // basic behaviour
        Component component = new ComponentA();
        // wrap in decorator A for extra behaviour
        component = new ComponentDecoratorA(component);
        // wrap in decorator B for extra behaviour
        component = new ComponentDecoratorB(component);

        System.out.println(component.execute());

    }

}
