public class ConcreteHandler1 extends BaseHandler {

    public ConcreteHandler1(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        if (shouldProcess()) {
            System.out.println("Handler 1");
        }

        if (shouldPass()) {
            super.handle();
        }
    }

    private boolean shouldProcess() {
        return true;
    }

    private boolean shouldPass() {
        return true;
    }

}
