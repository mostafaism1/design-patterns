public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(originator);

        System.out.println(originator.getText());

        for (char c = 'a'; c <= 'z'; c++) {
            careTaker.save();
            originator.setText(originator.getText() + c);
            System.out.println(originator.getText());
        }

        for (char c = 'a'; c <= 'z'; c++) {
            careTaker.undo();
            System.out.println(originator.getText());
        }
    }
}
