import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть число: ");
        int a = 0;
        int s = 0;

        while (a != -1) {
            a = scanner.nextInt();
            s += a;
        }

        System.out.println(s);


        scanner.close();
    }
}