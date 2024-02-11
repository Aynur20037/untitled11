package Test3;

public class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Двигатель мотоцикла запущен.");
        System.out.println("Проверка состояния цепи и смазка.");
        System.out.println("Мотоцикл готов к движению.");
    }

    public void stopEngine() {
        System.out.println("Двигатель мотоцикла остановленa.");

    }

    @Override
    public void drive() {
        System.out.println("Мотоцикл едет.");
    }
}
