public class Rectangle extends Shape {

    private int length;
    private int width;

    // regular constructor
    public Rectangle(int x, int y, String color, int length, int width) {
        super(x, y, color);
        this.length = length;
        this.width = width;
    }

    // proto-type constructor
    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle:" + "\n\tlength: " + length + "\n\twidth: " + width + super.toString();

    }

}
