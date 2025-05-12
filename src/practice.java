import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String iWannaBeMan;
        final int NUM = 0;
        String word = "lol";
        iWannaBeMan = NUM + " " + word;
        System.out.println("word"+ " = " + word);
        System.out.println("iWannaBeMan" + " = " + iWannaBeMan);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
            System.out.println("Введите ваше имя");
            Scanner s = new Scanner(System.in);
            String b = "Привет" + " " + s.nextLine();
            System.out.println(b);
        }
    }
}
