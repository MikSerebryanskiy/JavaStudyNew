package Excersise01;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by user on 31.10.2016.
 */
public class OperatorSwitch {
    public static void main (String[] args) {
        String s = "Выберите один из вариантов фигуры для определения периметра";
        System.out.println(s);
        String menu1 = "1. Треугольник";
        System.out.println(menu1);
        String menu2 = "2. Квадрат";
        System.out.println(menu2);
        String menu3 = "3. Прямоугольник";
        System.out.println(menu3);
        Scanner ch = new Scanner(System.in);
        int x = ch.nextInt();
        switch (x) {
            case 1: System.out.println ("50");
                break;
            case 2: System.out.println ("30");
                break;
            case 3: System.out.println ("20");
                break;
            default: System.out.println ("Запустите программу заново");
        }
    }
}
