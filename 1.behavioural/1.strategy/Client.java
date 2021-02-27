public class Client {

    public static void main(String[] args) {
        Strategy strategy1 = new ConcreteStrategy1();
        Strategy strategy2 = new ConcreteStrategy2();

        Context context = new Context(strategy1);
        System.out.println(context.executeStrategy());

        context.setStrategy(strategy2);
        System.out.println(context.executeStrategy());
    }

}
