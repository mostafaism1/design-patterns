public class Client {

    public static void main(String[] args) {

        Handler handler2 = new ConcreteHandler2(null);
        Handler handler1 = new ConcreteHandler1(handler2);

        handler1.handle();
    }
}
