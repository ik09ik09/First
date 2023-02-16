package practics;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("из: ");
        String from = scanner.nextLine();

        System.out.println("в: ");
        String to = scanner.nextLine();

        System.out.println("Введите значение: ");
        int value = scanner.nextInt();

        if (from.equals("mb") && to.equals("kb")) {
            System.out.println("Результат: " + value * 1024);
        }else if (from.equals("kb") && to.equals("mb")) {
            System.out.println("Результат: " + value / 1024);
        }else {
            System.out.println("какое то значение не правильно ввели! Попробуйте заново!");
       }
   }
}
