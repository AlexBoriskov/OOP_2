package task01;

public class Circle implements Figura{

    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (){
        this.radius = 10;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void greet(){
        System.out.println();
        System.out.printf("Окружность имеет радиус равный %.1f", getRadius());
        System.out.println();
    }

    @Override
    public double calculateArea() {
        return 2*3.14*getRadius();
    }

    @Override
    public double calculatePerimetr() {
        return 2.*3.14*getRadius()*getRadius();
    }

    
    
}
