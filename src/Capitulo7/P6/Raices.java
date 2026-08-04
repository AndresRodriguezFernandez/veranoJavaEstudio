package Capitulo7.P6;

public class Raices {
    private int a, b, c;

    public Raices(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminante() {
        return (Math.pow(this.b, 2))-4*this.a*this.c;
    }
}
