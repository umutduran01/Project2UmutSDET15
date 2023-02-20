package Task1;

public class Square implements Shape {

    private double side;

    void setSide(double side) {
        this.side = side;
    }

    double getSide() {
        return side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area is " + (side * side));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square perimeter is " + (4 * side));

    }
}
