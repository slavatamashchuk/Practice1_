import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.print("Введіть третье число: ");
        int c = scanner.nextInt();

        if (a + b > c) {
            System.out.print("Трикутник існує");
        } else {
            System.out.print("Такого трикутника не існує");
        }

        scanner.close();
    }
}