package Core;

import java.util.Scanner;

public class NameValidator {

    public static String name() {
        System.out.println("Введите Ваше имя: ");
        String current = new Scanner(System.in).nextLine();
        if (current.contains(" ")) {
            System.out.println("В Вашем имени есть пробел.");
            return name();
        }
        if (current.matches(".*\\d.*")) {
            System.out.println("В Вашем имени есть числа.");
            return name();
        } else {
            current = current.substring(0, 1).toUpperCase() + current.substring(1);
            System.out.println("Ваше имя: " + current);
            return current;
        }
    }
}
