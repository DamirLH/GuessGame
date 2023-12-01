package Core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameChoice {

    public static int choice() {
        int current = 111;
        System.out.println("Выберите какую игру Вы хотите запустить\nДля запуска «Угадай число», введите 1");
        System.out.println("Для запуска «Загадай число», введите 2\nЧтобы выйти из приложения введите 0");
        try {
            current = new Scanner(System.in).nextInt();
            if (current == 1 || current == 2 || current == 0) {
                return current;
            } else {
                System.out.println("Вы ввели не те числа.");
                return choice();
            }
        } catch (InputMismatchException e) {
            System.err.println("Вы ввели не числа.");
            return choice();
        }
    }
}
