public class HappyState implements State {

    Context context;

    public HappyState(Context context) {
        this.context = context;
    }

    @Override
    public String mood() {        
        this.context.setState(new SadState(context));
        return "Happy";
    }

}
