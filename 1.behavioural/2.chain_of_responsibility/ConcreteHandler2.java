public class ConcreteHandler2 extends BaseHandler {

    public ConcreteHandler2(Handler next) {
        this.next = next;
    }

    @Override
    public void handle() {
        if (shouldProcess()) {
            System.out.println("Handler 2");
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
