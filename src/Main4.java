import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String a = scanner.nextLine();
        System.out.print("Введіть друге ім'я: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.print("імена ідентичні");
        } else if (a.length() == b.length()) {
            System.out.print("довжини імен рівні");
        }

        scanner.close();
    }
}