package task03;

public class Main {
    public static void main(String[] args) {
        Rectangle rec01 = new Rectangle(12, 4);
        Rectangle rec02 = new Rectangle();

        rec01.greet();
        System.out.printf("Площадь = %.1f", rec01.calculateArea(rec01.getWidth(), rec01.getHeight()));
        System.out.println();
        System.out.printf("Периметр = %.1f", rec01.calculatePerimetr(rec01.getWidth(), rec01.getHeight()));

        rec02.greet();
        System.out.printf("Площадь = %.1f", rec02.calculateArea(rec02.getWidth(), rec02.getHeight()));
        System.out.println();
        System.out.printf("Периметр = %.1f", rec02.calculatePerimetr(rec02.getWidth(), rec02.getHeight()));
    }
}
