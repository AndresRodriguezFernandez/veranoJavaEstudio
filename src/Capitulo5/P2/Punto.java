package Capitulo5.P2;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void sumaX(int dato){
        this.x += dato;
    }

    public void multiplicarX(int dato){
        this.x *= dato;
    }

    public void restarY(int dato) {
        this.y -= dato;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
