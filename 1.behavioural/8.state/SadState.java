public class SadState implements State {

    Context context;

    public SadState(Context context) {
        this.context = context;
    }

    @Override
    public String mood() {
        this.context.setState(new AngryState(context));
        return "Sad";
    }

}
