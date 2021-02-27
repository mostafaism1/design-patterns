public class AngryState implements State {

    Context context;

    public AngryState(Context context) {
        this.context = context;
    }

    @Override
    public String mood() {        
        this.context.setState(new HappyState(context));
        return "Angry";
    }

}
