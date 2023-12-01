package Core;


import java.util.Scanner;

public class ComputerGC {

    public static void greeting() {
        System.out.println("Вы выбрали игру «Загадай число»\n Вам нужно загадать число, а компьютер должен отгадать");
    }

    public static String ready() {
        System.out.println("Вам нужно загадать число от 0, до 100\n Как только Вы загадаете число, введите «Дальше» ");
        String temp = new Scanner(System.in).nextLine();
        return temp;
    }

    public static boolean readyChecker(String temp) {
        if (temp.equalsIgnoreCase("Дальше")) {
            return true;
        } else if (temp.equalsIgnoreCase("-1")) {
            Main.stopGame();
            return true;
        } else return false;
    }
    public static int computerAnswer(int max, int min){
        return (max-min)/2+min;
    }
    public static void suggest(int suggest){
        System.out.println("Компьютер предлагает число: "+suggest+"\n  Сравните это число с Вашим");
    }
    public static String userAnswer(){
        String answer;
        System.out.println("Если число на экране больше Вашего, то введите <<больше>>" +
                "\n  Если число на экране меньше Вашего, то введите <<меньше>>" +
                "\n Если число на экране совпадает с Вашим, то введите <<правильно>>" +
                "\n Для выхода введите «-1»" );
        answer=new Scanner(System.in).nextLine();
        if (answer.equalsIgnoreCase("Больше") || answer.equalsIgnoreCase("Меньше")
        || answer.equalsIgnoreCase("Правильно") || answer.equalsIgnoreCase("-1")){
            return answer;
        }
        else return userAnswer();
    }
}
