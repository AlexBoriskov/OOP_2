package task04;

interface Figura {
    
    static int calculatePerimetr(int a, int b){
        return 2*(a+b);
    }

    static int calculateArea(int a, int b){
        return a*b;
    }
}
