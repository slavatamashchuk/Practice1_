import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть дату народження (день): ");
        int date_d = scanner.nextInt();
        System.out.print("Введіть дату народження (місяць): ");
        int date_m = scanner.nextInt();
        System.out.print("Введіть дату народження (рік): ");
        int date_y = scanner.nextInt();

        System.out.printf("Мене звати %s. Я народився %02d.%02d.%04d.", name, date_d, date_m, date_y);


        scanner.close();
    }
}