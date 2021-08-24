import java.util.Random;

public class BotGame {
    Random random = new Random();
    int choice = random.nextInt(2);
    int win = random.nextInt(10000);
    String fort = choice == 0 ?"Вы выиграли в " :"Вы проиграли в";
@Command(mainCommand = "покер")
    public void playPoker(){
        System.out.printf("%s покер %dруб \n", fort,win);
    }
    @Command(mainCommand = "рулетка")
    public void playRoulette(){
        System.out.printf("%s рулетка %dруб \n", fort,win);
    }
    @Command(mainCommand = "игровой автомат")
    public void playSlotMachine (){
        System.out.printf("%s игровой автомат %dруб \n", fort,win);
    }
    @Command(mainCommand = "блекджек")
    public void playBlackjack(){
        System.out.printf("%s блекджек %dруб \n", fort,win);
    }
    @Command(mainCommand = "колесо фортуны")
    public void playWheelOfFortune(){
        System.out.printf("%s колесо фортуны %dруб \n", fort,win);
    }
    @Command(mainCommand = "баккара")
    public void playBaccarat(){
        System.out.printf("%s баккара %dруб \n", fort,win);
    }
    @Command(mainCommand = "выход")
    public void exit(){
        System.exit(0);
    }
}
