public class Client {

    public static void main(String[] args) {

        Shape circle = new Circle(0, 0, "red", 1);
        Shape clonedCircle = circle.clone();

        System.out.println(circle);
        System.out.println(clonedCircle);

        Shape rectangle = new Rectangle(1, 2, "blue", 3, 4);
        Shape clonedRectangle = rectangle.clone();

        System.out.println(rectangle);
        System.out.println(clonedRectangle);

    }
}
