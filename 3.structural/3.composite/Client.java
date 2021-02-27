public class Client {

    public static void main(String[] args) {

        Number two = new LiteralNumber(2);
        Number three = new LiteralNumber(3);
        Number four = new LiteralNumber(4);
        Number twoPlusThree = new BinaryExpression(two, three, Math::addExact);
        Number twoPlusThreeTimesFour = new BinaryExpression(twoPlusThree, four, Math::multiplyExact);

        System.out.println("two equals:\n\t" + two.value());
        System.out.println("twoPlusThree equals:\n\t" + twoPlusThree.value());
        System.out.println("twoPlusThreeTimesFour equals:\n\t" + twoPlusThreeTimesFour.value());
    }
}
