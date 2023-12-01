package Core;

public class Main {
    public static String name;
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в меню.");
        name = NameValidator.name();
        do {
            int choice = GameChoice.choice();
            if (choice==1){
                HumanStart.starter();
            }else if (choice==2){
                ComputerStart.starter();
            }else if (choice==0){
                stopGame();break;
            }
        }while (true);
        System.out.println("Игра завершена. ");


    }
    public static void stopGame(){
        System.out.println("Спасибо за участие, "+name);
    }
}
