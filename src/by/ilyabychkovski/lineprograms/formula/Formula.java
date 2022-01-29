package by.ilyabychkovski.lineprograms.formula;

import java.util.Scanner;

/**
 * z = ( (a – 3 ) * b / 2) + c.
 */
public class Formula {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение а:");
        int a = scanner.nextInt();

        System.out.println("Введите значение b:");
        int b = scanner.nextInt();

        System.out.println("Введите значение с:");
        int c = scanner.nextInt();

        int z = ( (a - 3 ) * b / 2) + c;
        System.out.println("Ваше z равняется: " + z);
    }
}
