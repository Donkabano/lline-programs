package by.ilyabychkovski.lineprograms.sum;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число:");
        int lastNumber = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= lastNumber; i++) {

            sum += i;
        }

        System.out.println("Сумма всех чисел равняется: " + sum);
    }
}
