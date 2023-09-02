package task01;

import task01.Figura;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle01 = new Rectangle(12, 24);
        Rectangle rectangle02 = new Rectangle();

        Circle circle01 = new Circle(20);
        Circle circle02 = new Circle();

        rectangle01.greet();
        System.out.printf("Площадь равна %.1f. Периметр равен %.1f", rectangle01.calculateArea(), rectangle01.calculatePerimetr());

        rectangle02.greet();
        System.out.printf("Площадь равна %.1f. Периметр равен %.1f", rectangle02.calculateArea(), rectangle02.calculatePerimetr());
    
        circle01.greet();
        System.out.printf("Площадь равна %.1f. Периметр равен %.1f", circle01.calculateArea(), circle01.calculatePerimetr());

        circle02.greet();
        System.out.printf("Площадь равна %.1f. Периметр равен %.1f", circle02.calculateArea(), circle02.calculatePerimetr());
    
    }
}
