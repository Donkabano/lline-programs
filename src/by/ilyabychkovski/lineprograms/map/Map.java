package by.ilyabychkovski.lineprograms.map;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */
public class Map {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальный х:");
        double x1 = scanner.nextDouble();

        System.out.println("Введите конечный х:");
        double x2 = scanner.nextDouble();

        System.out.println("Введите начальный у:");
        double y1 = scanner.nextDouble();

        System.out.println("Введите конечный у:");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координату х для точки:");
        double x3 = scanner.nextDouble();

        System.out.println("Введите координату у для точки:");
        double y3 = scanner.nextDouble();

        boolean result = ( x3 >= x1 && x3 <= x2 ) && ( y3 >= y1 && y3 <= y2 );
        if (result) {
            System.out.println("Точка закрашена");
        } else {
            System.out.println("Точка не закрашена");
        }
    }
}
