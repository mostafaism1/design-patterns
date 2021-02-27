public class Client {

    public static void main(String[] args) {

        Device tv = new TV();
        Device radio = new Radio();

        Remote tvRemote = new RemoteA(tv);
        Remote radioRemote = new AdvancedRemote(radio);

        // normally we wouldn't directly call methods on the implementation classes (tv
        // and radio)
        // in the client code.
        // we're only making those calls for testing purposes.
        System.out.println(tv.getChannel());
        tvRemote.channelUp();
        System.out.println(tv.getChannel());

        System.out.println(radio.getVolume());
        radioRemote.volumeUp();
        System.out.println(radio.getVolume());
    }
}