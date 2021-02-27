public class Client {

    public static void main(String[] args) {

        Factory factory;

        int config = readApplicationConfig();
        if (config == 1) {
            factory = new Factory1();
        } else {
            factory = new Factory2();
        }

        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.printProductAName();
        productB.printProductBName();
    }

    private static int readApplicationConfig() {
        return 1;
    }

}
