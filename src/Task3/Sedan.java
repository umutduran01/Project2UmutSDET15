package Task3;

public class Sedan extends Car {

    double length;

    double calculateSalePrice() {
        if (length > 20) {
            return (carPrice * 0.95);
        } else {
            return (carPrice * 0.90);
        }
    }
}
