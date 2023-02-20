package Task1;

public class Task1Tester {
    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setRadius(3);
        System.out.println(circle.getRadius());
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square = new Square();

        square.setSide(3);
        System.out.println(square.getSide());
        square.calculateArea();
        square.calculatePerimeter();

    }
}
