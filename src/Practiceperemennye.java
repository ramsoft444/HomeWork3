import java.util.Scanner;

public class Practiceperemennye {
    public static void main(String[] args) {
      int myInt = 20;
        if (5>10){
          System.out.println("правильноо");
      }else if (myInt>25){
          System.out.println("не верно");
      }else {
            System.out.println("се пиздеж");
            Scanner s = new Scanner(System.in);
            System.out.println("Введите любое число)");
            byte f = s.nextByte();
            System.out.println("Вы ввели" + " " + f);
        }
    }
}
