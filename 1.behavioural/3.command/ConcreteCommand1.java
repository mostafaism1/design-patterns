public class ConcreteCommand1 implements Command {

    private Receiver receiver;
    private String argument;

    public ConcreteCommand1(Receiver receiver, String argument) {
        this.receiver = receiver;
        this.argument = argument;
    }

    @Override
    public String execute() {
        receiver.setText(argument);
        return receiver.getText();
    }
}
