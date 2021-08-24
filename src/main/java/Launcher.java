import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Привет, давай сыграем в игру ? \nДА / ВЫХОД");
        String userAnswer = console.nextLine().toLowerCase();
        while (userAnswer.equals("да") ? true : false) {
            System.out.println(
                    "  покер\n" +
                            "  рулетка\n" +
                            "  игровой автомат (однорукий бандит)\n" +
                            "  блекджек\n" +
                            "  колесо фортуны\n" +
                            "  баккара");
            String userInput = console.nextLine().toLowerCase();
            BotGame botGame = new BotGame();

            Method[] methods = botGame.getClass().getDeclaredMethods();

            for (Method method : methods) {
                Annotation[] methodAnnotations = method.getDeclaredAnnotations();
                for (Annotation annotation : methodAnnotations) {
                    if (annotation.annotationType() == Command.class) {
                        String command = ((Command) annotation).mainCommand();

                        if (userInput.equals(command)) {
                            try {
                                method.invoke(botGame);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }
        }
    }
}
