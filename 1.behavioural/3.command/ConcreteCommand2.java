public class ConcreteCommand2 implements Command {

    private Receiver receiver;
    private String argument;

    public ConcreteCommand2(Receiver receiver, String argument) {
        this.receiver = receiver;
        this.argument = argument;
    }

    @Override
    public String execute() {
        receiver.setText(argument);
        return receiver.getText();
    }
}
