package task03;

public class Rectangle implements Figura {
    
    private double width;
    private double height;

    public Rectangle(){
        this.width = 5;
        this.height = 2;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void greet(){
        System.out.println();
        System.out.printf("Прямоугольник с %.1f (Длина) и %.1f (Ширина)", getWidth(), getHeight());
        System.out.println();
    }
}
