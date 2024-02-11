package Test4;

import java.util.Scanner;

public class Television extends Device {
    @Override
    public void turnOn() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Есть ли у вас пульт?");
            String remoteController = scanner.nextLine();

            if (remoteController.equalsIgnoreCase("Да")) {
                System.out.println("Нажмите на красную кнопку на пульте");
                break;
            } else if (remoteController.equalsIgnoreCase("Нет")) {
                System.out.println("Найти кнопку на телевизоре");
                break;
            } else {
                System.out.println("Ответы могут быть только 'Да' или 'Нет'");
            }
        }

        System.out.println("Телевизор включился");
    }
    @Override
    public void turnOff() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Есть ли у вас пульт?");
            String remoteController = scanner.nextLine();

            if (remoteController.equalsIgnoreCase("Да")) {
                System.out.println("Нажмите на красную кнопку на пульте");
                break;
            } else if (remoteController.equalsIgnoreCase("Нет")) {
                System.out.println("Найти кнопку на телевизоре");
                break;
            } else {
                System.out.println("Ответы могут быть только 'Да' или 'Нет'");

            }
        }

        System.out.println("Телевизор выключился");
    }
}