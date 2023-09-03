package task05;

public class Circle implements RoundedFigures{
    
    private int radiusX;
    private int radiusY;
    private boolean proverka;

    public Circle (){
        this.radiusX = 10;
        this.radiusY = 10;
        this.proverka = true;
    }

    public Circle (int radiusX, int radiusY){
        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.proverka = true;
    }

    public int getRadiusX(){
        return radiusX;
    }

    public void setRadiusX(int radiusX){
        this.radiusX = radiusX;
    }

    public int getRadiusY (){
        return radiusY;
    }

    public void setRadiusY(int radiusY){
        this.radiusY = radiusY;
    }

    public boolean getProverka(){
        return proverka;
    }



    @Override
    public void CircleOrNot() {
        if (radiusX != radiusY) {
            proverka = false;
        }        
    }

    @Override
    public void greet() {
        System.out.println();
        System.out.println();
        if (proverka) {
            System.out.printf("Окружность с радиусом %d", getRadiusX());
        }
        else {
            System.out.printf("Овал с радиусами %1d и %1d", getRadiusX(), getRadiusY());
        }
    }

    


}
