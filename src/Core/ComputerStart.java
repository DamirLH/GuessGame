package Core;


public class ComputerStart {
    private static int max = 100;
    private static int min = 0;


    public static void starter() {
        String userReady;
        ComputerGC.greeting();
        do {
            userReady = ComputerGC.ready();
        } while (!ComputerGC.readyChecker(userReady));

        int computerAnswer = ComputerGC.computerAnswer(max, min);
        ComputerGC.suggest(computerAnswer);
        String playerAnswer = ComputerGC.userAnswer();
        while (!playerAnswer.equalsIgnoreCase("Правильно")) {
            if (playerAnswer.equalsIgnoreCase("Больше")) {
                min = computerAnswer;
            } else if (playerAnswer.equalsIgnoreCase("Меньше")) {
                max = computerAnswer;
            } else if (playerAnswer.equalsIgnoreCase("-1")) {
                System.out.println("Игра остановлена");
                Main.stopGame();
                break;
            }
            computerAnswer = ComputerGC.computerAnswer(max, min);
            ComputerGC.suggest(computerAnswer);
            playerAnswer = ComputerGC.userAnswer();
        }
        if (playerAnswer.equalsIgnoreCase("Правильно")) {
            System.out.println("Игра закончена. Ваше число " + computerAnswer);
        }

    }


}
