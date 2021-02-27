public abstract class BaseHandler implements Handler {

    Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle() {
        if (next != null) {
            next.handle();
        }
    }

}
