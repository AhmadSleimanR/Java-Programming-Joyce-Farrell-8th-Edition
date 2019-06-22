package cardemo;

public class CarDemo {
public static void main(String[] args) {
        Car firstCar = new Car(1983, Model.SEDAN,Color.BLACK);
        Car secondCar = new Car(1995, Model.SEDAN, Color.BLUE);
        firstCar.display();
        secondCar.display();
        
    }
    
}
