package Task3;

public class Task3Testing {
    public static void main(String[] args) {

        Sedan sedan = new Sedan();

        sedan.carPrice = 20000;
        sedan.length = 23;
        System.out.println("Sedan price is " + sedan.calculateSalePrice());

        Truck truck = new Truck();
        truck.carPrice = 18999;
        truck.weight = 1900;
        System.out.println("Truck price is " + truck.calculateSalePrice());

    }
}
