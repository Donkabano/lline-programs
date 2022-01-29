package by.ilyabychkovski.lineprograms.time;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: НН:ММ:SS.
 */
public class Time {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите нужное колличество секунд:");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutesAndSeconds = seconds % 3600;
        int minutes = minutesAndSeconds / 60;
        int secondsFinal = minutesAndSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + secondsFinal );

    }

}
