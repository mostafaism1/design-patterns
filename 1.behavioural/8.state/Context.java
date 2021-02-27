public class Context {

    private State state;

    public Context() {
        this.state = new HappyState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String mood() {
        return state.mood();
    }

}
