package Capitulo7.P6;

public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminante() {
        return ((Math.pow(b, 2)) - (4 * a * c));
    }

    //devuelve un boolean indicando si tiene dos soluciones
    //true si las tiene
    public boolean tieneRaices(double discriminante){
        boolean res;
        if (discriminante > 0){
            res = true;
        }else {
            res = false;
        }
        return res;
    }

    //true si tiene una única solución
    public boolean tieneRaiz(double discriminante) {
        boolean res;
        if (discriminante == 0){
            res = true;
        }else {
            res = false;
        }
        return res;
    }

    public void obtenerRaices(double discriminante){
        double res1 = ((-this.b)+Math.sqrt(discriminante))/(2*this.a);
        double res2 = ((-this.b)-Math.sqrt(discriminante))/(2*this.a);
        System.out.println("Solución 1: " + res1 + "\nSolución 2: " + res2);
    }

    public void obtenerRaiz(double discriminante){
        double resUni = ((-this.b)+Math.sqrt(discriminante))/(2*this.a);
        System.out.println("La solución única es: " + resUni);
    }

    public void Calcular() {
        double discriminante = getDiscriminante();
        if (tieneRaices(discriminante)) {
            obtenerRaices(discriminante);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(discriminante);
        }else if (discriminante < 0){
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
