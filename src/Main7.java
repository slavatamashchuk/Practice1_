import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.print("Введіть третье число: ");
        int c = scanner.nextInt();

        if (a > b && a < c) {
            System.out.println(a);
        } else if (b > a && b < c) {
            System.out.println(b);
        } else if (c > b && c < a) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }

        scanner.close();
    }
}