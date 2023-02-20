package Task1;

public class Circle implements Shape {

    private double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle area is " + (radius * radius * Math.PI));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Circle perimeter is " + (2 * radius * Math.PI));

    }
}
