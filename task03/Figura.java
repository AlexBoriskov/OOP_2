package task03;

interface Figura {
    
    default double calculateArea (double a, double b){
        return a*b;
    }

    default double calculatePerimetr (double a, double b){
        return 2*(a+b);
    }

}
