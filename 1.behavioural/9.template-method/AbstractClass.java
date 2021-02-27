public abstract class AbstractClass {

    public void templateMethod() {
        stepA();
        stepB();
        stepC();
    }

    public void stepA() {
        System.out.println("default step A");
    }

    public abstract void stepB();

    public abstract void stepC();
}