package task01;

import task01.Figura;

public class Rectangle implements Figura {

    private double width;
    private double height;

    public Rectangle(){
        this.width = 25;
        this.height = 10;
    }

    public Rectangle (double width, double height){
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

    @Override
    public double calculateArea() {
        return getHeight()*getWidth();        
    }

    @Override
    public double calculatePerimetr() {
        return 2*(getHeight()*getWidth());        
    }

    public void greet() {
        System.out.println();
        System.out.printf("Прямоугольник с размерами %.1f (Длина) и %.1f (Ширина)", getWidth(), getHeight());
        System.out.println();
    }

}
