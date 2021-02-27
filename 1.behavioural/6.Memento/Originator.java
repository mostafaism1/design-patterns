public class Originator {
    private String text;

    public Originator() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public Memento snapShot() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        this.text = memento.text;
    }

    class Memento {

        private final String text;

        public Memento(String text) {
            this.text = text;
        }
    }
}