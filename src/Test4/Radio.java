package Test4;
import java.util.Scanner;

public class Radio extends Device {
    public void turnOn() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Есть ли у радио кнопка включения?");
            String powerButton = scanner.nextLine();

            if (powerButton.equalsIgnoreCase("Да")) {
                System.out.println("Нажмите кнопку включения на радио.");
                break;
            } else if (powerButton.equalsIgnoreCase("Нет")) {
                System.out.println("Убедитесь, что радио подключено к электропитанию и попробуйте найти кнопку включения.");
                break;
            } else {
                System.out.println("Ответы могут быть только 'Да' или 'Нет'");

            }
        }

        System.out.println("Радио включено.");
    }
    public void turnOff() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Есть ли у радио кнопка выключения?");
            String powerButton = scanner.nextLine();

            if (powerButton.equalsIgnoreCase("Да")) {
                System.out.println("Нажмите кнопку выключения на радио.");
                break;
            } else if (powerButton.equalsIgnoreCase("Нет")) {
                System.out.println("Убедитесь, что радио подключено к электропитанию и попробуйте найти кнопку выключения.");
                break;
            } else {
                System.out.println("Ответы могут быть только 'Да' или 'Нет'");

            }
        }

        System.out.println("Радио выключено.");
    }
}
