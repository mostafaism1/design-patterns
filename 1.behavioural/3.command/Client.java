public class Client {

    public static void main(String[] args) {
        
        Receiver receiver = new Receiver();

        Command command1 = new ConcreteCommand1(receiver, "Hello");
        Command command2 = new ConcreteCommand1(receiver, "Bye");
        
        Sender sender = new Sender(command1, command2);

        System.out.println(sender.executeCommand1());

        System.out.println(sender.executeCommand2());
    }    
}
