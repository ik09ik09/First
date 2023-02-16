package practics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number for y: ");
        int y = scanner.nextInt();

        System.out.println("Enter number for x: ");
        int x = scanner.nextInt();

        if (x > 0 && y > 0){
            System.out.println("Четверть I");
       }else  if (x < 0 && y > 0) {
            System.out.println("Четверть II");
        }else if (x < 0 && y < 00) {
            System.out.println("Четверть III");
        }else if (x > 0 && y <0){
            System.out.println("Четверть VI");

        }
    }
}
