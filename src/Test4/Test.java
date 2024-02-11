package Test4;

public class Test {
    public static void main(String[] args) {
        Device television = new Television();
        Device radio = new Radio();
        Device computer = new Computer();
        television.turnOn();
        television.turnOff();
        radio.turnOn();
        radio.turnOff();
        computer.turnOn();
        computer.turnOff();

    }
}
