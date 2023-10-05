import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();


        for (int i = 0; i <= 9; i++) {
            System.out.printf("%s любить мене!\n", name);
        }


        scanner.close();
    }
}