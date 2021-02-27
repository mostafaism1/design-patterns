public abstract class Shape {

    private int x;
    private int y;
    private String color;

    // regular constructor
    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // proto-type constructor
    public Shape(Shape shape) {
        this(shape.x, shape.y, shape.color);
    }

    public abstract Shape clone();

    @Override
    public String toString() {
        return "\n\tx: " + x + "\n\ty: " + y + "\n\tcolor: " + color;
    }

}
