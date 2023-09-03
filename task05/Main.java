package task05;

public class Main {
    
    public static void main(String[] args) {
        Rectangle rec01 = new Rectangle();
        Rectangle rec02 = new Rectangle(10, 10);

        Circle circle01 = new Circle();
        Circle circle02 = new Circle(6, 4);


        rec01.greet();
        System.out.printf ("Периметр = %1d, Площадь = %1d", rec01.calculatePerimetr(), rec01.calculateArea());

        rec02.greet();
        System.out.printf ("Периметр = %1d, Площадь = %1d", rec02.calculatePerimetr(), rec02.calculateArea());
    
        circle01.CircleOrNot();
        circle01.greet();
    
        circle02.CircleOrNot();
        circle02.greet();
    }
}
