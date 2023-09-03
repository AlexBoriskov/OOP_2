package task02;

public class Main {

    public static void main(String[] args) {
        Circle circle01 = new Circle();
        Circle circle02 = new Circle(30);

        circle01.greet();
        System.out.printf("Площадь окружности = %.1f", Constants.PI*circle01.getRadius()*circle01.getRadius());
        System.out.println();
        System.out.printf("Периметр круга = %.1f", 2*Constants.PI*circle01.getRadius());
        

        circle02.greet();
        System.out.printf("Площадь окружности = %.1f", Constants.PI*circle02.getRadius()*circle02.getRadius());
        System.out.println();
        System.out.printf("Периметр круга = %.1f", 2*Constants.PI*circle02.getRadius());
    
        
    }
}
