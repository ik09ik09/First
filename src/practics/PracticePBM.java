package practics;

import java.util.Scanner;

public class PracticePBM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Если вы мужчина нажмите №1 \n Если вы женшина нажмите №2");
        int gender = scanner.nextInt();
        switch (gender){
            case 1:
                System.out.println(" Ваш пол Мужской");
                break;
            case 2:
                System.out.println("Ваш пол Женский");
                break;
        }
        System.out.println("Укажите ваш Вес");
    }
}
