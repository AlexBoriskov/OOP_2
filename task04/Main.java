package task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner iscanner = new Scanner(System.in);

        System.out.println("Длина прямоугольника:");
        int width = Integer.parseInt(iscanner.nextLine());
        System.out.println("Ширина прямоугольника:");
        int height = Integer.parseInt(iscanner.nextLine());

        
        System.out.printf("Прямоугольник со сторонами %d (Длина) и %1d (Ширина)", width, height);
        System.out.println();
        System.out.printf("Площадь = %d, Периметр = %d", Figura.calculateArea(width, height), Figura.calculatePerimetr(width, height));


        iscanner.close();
    }
}
