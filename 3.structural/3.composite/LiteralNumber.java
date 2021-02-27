public class LiteralNumber implements Number {

    private int number;

    public LiteralNumber(int number) {
        this.number = number;
    }

    @Override
    public int value() {
        return number;
    }

}
