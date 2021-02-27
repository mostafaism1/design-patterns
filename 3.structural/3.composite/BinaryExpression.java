import java.util.function.BiFunction;

public class BinaryExpression implements Number {

    private Number firstNumber;
    private Number secondNumber;
    private BiFunction<Integer, Integer, Integer> operation;

    public BinaryExpression(Number firstNumber, Number secondNumber, BiFunction<Integer, Integer, Integer> operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    @Override
    public int value() {
        return operation.apply(firstNumber.value(), secondNumber.value());
    }

}
