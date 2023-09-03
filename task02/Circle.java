package task02;

public class Circle implements Constants {
    
    private double radius;

    public Circle (){
        this.radius = 10;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius (double radius){
        this.radius = radius;
    }

    public void greet(){
        System.out.println();
        System.out.printf("Окружность с радиусом = %.1f", getRadius());
        System.out.println();
    }
}
