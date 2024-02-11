package Test3;

public class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель грузовика запущен.");
        System.out.println("Проверка тормозной системы и уровня топлива.");
        System.out.println("Грузовик готов к погрузке и перевозке груза.");
    }

    public void stopEngine() {
        System.out.println("Двигатель грузовика остановлен.");

    }

    @Override
    public void drive() {
        System.out.println("Грузовик начал движение.");
    }
}
