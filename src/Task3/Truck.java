package Task3;

public class Truck extends Car{

    double weight;

    double calculateSalePrice(){
        if (weight > 2000){
            return (carPrice * 0.90);
        }else {
            return (carPrice * 0.80);
        }
    }

}
