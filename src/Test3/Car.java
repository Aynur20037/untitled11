package Test3;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель машины запущен. ");
        System.out.println("Система управления двигателем проходит диагностику.");
        System.out.println("Салон автомобиля прогревается.");
    }

    public void stopEngine() {
        System.out.println("Двигатель машины остановлен.");

    }

    @Override
    public void drive() {
        System.out.println("Машина едет.");
    }
}
