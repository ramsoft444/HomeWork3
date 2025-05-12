import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        String iWannaBeGeek; // не инициализированнная переменная
        final int NUM = -1;  // не изменяемая константа
        String word = "geek";
        iWannaBeGeek = NUM + word;
        System.out.println("word = " + word);
        System.out.println("iWannaBeGeek = " + iWannaBeGeek);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name + "!" );


    }
}



