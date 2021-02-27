public class Client {

    public static void main(String[] args) {

        Context context = new Context();

        for (int i = 0; i < 10; i++) {
            System.out.println(context.mood());
        }
    }

}
