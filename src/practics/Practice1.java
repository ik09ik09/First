package practics;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c < a && c < b ){
            System.out.println(c);

        }else {System.out.println(b);
        }
    }
}
