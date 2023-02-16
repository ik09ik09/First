package practics;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();

        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Min " + number1);
        }else if (number2 < number1 && number2 <= number3){
            System.out.println("Min " + number2);
        }else if (number3 < number1 && number3 < number2){
            System.out.println("Min " + number3);
        }

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Max " + number1);
        }else if (number2 > number1 && number2 >= number3){
            System.out.println("Max " + number2);
        }else if (number3 > number1 && number3 > number2){
            System.out.println("Max " + number3);
        }

    }
}
