package Core;

public class HumanStart {

    public static void starter(){
        HumanGC.greeting();
        int computerNumb = HumanGC.createNumber();
        int playerNumb = HumanGC.enterNumber();
        while (!HumanGC.checker(computerNumb,playerNumb)){
            HumanGC.exitSuggest();
            playerNumb = HumanGC.enterNumber();
            if (playerNumb==-1){break;}
        }
    }
}
