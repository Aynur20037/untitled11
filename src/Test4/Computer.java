package Test4;

import java.util.Scanner;

public class Computer extends Device {
    @Override
    public void turnOn() {
        System.out.println("Нажмите на кнопку 'Power' ");
        System.out.println( "ПК включился ");
    }

    @Override
    public void turnOff() {
        System.out.println("Нажмите на кнопку 'Power' ");
        System.out.println( "ПК выключился ");
    }
}