public class Client {

    public static void main(String[] args) {

        Creator creator;

        int config = readApplicationConfig();
        if (config == 1) {
            creator = new CreatorA();
        } else {
            creator = new CreatorB();
        }

        creator.printProductName();
    }

    private static int readApplicationConfig() {
        return 1;
    }

}
