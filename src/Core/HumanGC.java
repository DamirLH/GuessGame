package Core;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HumanGC {

    public static void greeting() {
        System.out.println("Вы выбрали игру «Угадай число»\n Вам нужно угадать число, которое загадал компьютер");
    }

    public static int createNumber() {
        return new Random().nextInt(100);
    }

    public static int enterNumber() {
        int temp = 0;
        System.out.println("Введите число от 0, до 100. Которое по Вашему мнению загадал компьютер: ");
        try {
            temp = new Scanner(System.in).nextInt();
            if (temp > 100 || temp < -1) {
                System.out.println("Вы вышли из предпологаемого диапазона. Повторите попытку..");
                return enterNumber();
            } else if (temp == -1) {
                Main.stopGame();
                return -1;
            } else {
                System.out.println("Ваше число: " + temp);
                return temp;
            }
        } catch (InputMismatchException e) {
            System.err.println("Нужно ввести число!");
            return enterNumber();
        }
    }
    public static void exitSuggest(){
        System.out.println("Чтобы выйти из игры, введите: -1");
    }

    public static boolean checker(int computer, int player) {
        boolean temp = false;
        if (computer > player) {
            System.out.println("Ваше число меньше загаданного. Повтоите попытку.");
            temp = false;
        } else if (computer < player) {
            System.out.println("Ваше число больше загаданного. Повторите попытку.");
            temp = false;
        } else if (computer == player) {
            System.out.println("Вы угадали загаданное число. Поздравляем!!!");
            temp = true;
        }
        return temp;
    }
}
