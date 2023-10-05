import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.print("Введіть третье число: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && a > c) {
            System.out.println(b);
        } else{
            System.out.println(c);
        }

        scanner.close();
    }
}