import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.print("Введіть третье число: ");
        int c = scanner.nextInt();
        System.out.print("Введіть четверте число: ");
        int d = scanner.nextInt();

        if (a < b && a < c && a < d) {
            System.out.println(a);
        }
        else if (b < a && b < c && d < c) {
            System.out.println(b);
        }
        else if (c < a && c < b && c < d) {
                System.out.println(c);
        } else {
            System.out.println(d);
        }

        scanner.close();
    }
}