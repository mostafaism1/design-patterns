public class Sender {

    private Command command1;
    private Command command2;

    public Sender(Command command1, Command command2) {
        this.command1 = command1;
        this.command2 = command2;
    }

    public String executeCommand1() {
        return command1.execute();
    }

    public String executeCommand2() {
        return command2.execute();
    }
}
