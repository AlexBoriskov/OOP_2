package task05;

public class Rectangle implements Figura {
    
    private int width;
    private int height;

    public Rectangle (){
        this.width = 5;
        this.height = 3;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int calculateArea(){
        return getWidth()*getHeight();
    }

    public int calculatePerimetr(){
        return 2*(getWidth()+getHeight());
    }

    @Override
    public void greet() {
        System.out.println();
        System.out.println();
        if (getHeight() == getWidth()){
            System.out.printf("Это квадрат со стороной %1d", getHeight());
        }
        else {
            System.out.printf("Это прямоугольник со сторонами %1d * %1d", getWidth(), getHeight());
        }
        System.out.println();
    }

    
}
