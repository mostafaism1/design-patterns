public class Circle extends Shape {

    private int radius;

    // regular constructor
    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    // proto-type constructor
    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;

    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle: " + "\n\tradius: " + radius + super.toString();
    }

}
