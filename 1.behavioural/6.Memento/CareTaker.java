import java.util.Stack;


public class CareTaker {

    private Originator originator;
    private Stack<Originator.Memento> history;

    public CareTaker(Originator originator) {
        this.originator = originator;
        history = new Stack<>();
    }

    public void undo() {
        if (!history.empty()) {
            originator.restore(history.pop());
        }        
    }

    public void save() {
        history.push(originator.snapShot());
    }    
    
}
