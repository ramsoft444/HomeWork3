import java.util.Random;
public class practice2 {
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static void main(String[] args) {
        System.out.println(permission(14, 10));
        System.out.println(permission(19, 27));
        System.out.println(permission(40, 28));
        System.out.println(permission(30, -22));
        System.out.println(permission(10, -9));
        System.out.println("Случайный возраст:" + " " + generateRandomAge2(10));
        System.out.println("Случайный возраст:" + " " +generateRandomAge2(-15));
        System.out.println("Случайный возраст:" + " " + generateRandomAge2(27));
        System.out.println("Случайный возраст:" + " " +generateRandomAge2(5));
        System.out.println("Случайный возраст:" + " " +generateRandomAge2(35));
    }
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
    public static String generateRandomAge2(int temperature) {
        int age = generateRandomAge();
        return age + " " + permission(age, temperature);
    }
}