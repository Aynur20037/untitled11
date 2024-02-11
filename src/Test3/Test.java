package Test3;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle truck = new Truck();
        car.startEngine();
        car.drive();
        car.stopEngine();
        motorcycle.startEngine();
        motorcycle.drive();
        motorcycle.stopEngine();
        truck.startEngine();
        truck.drive();
        truck.stopEngine();
    }
}
