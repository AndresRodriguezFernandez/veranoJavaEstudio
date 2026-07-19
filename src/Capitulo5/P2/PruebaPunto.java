package Capitulo5.P2;

public class PruebaPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p2.sumaX(3);
        System.out.println(p2.toString());

        p3.restarY(3);
        System.out.println(p3.toString());

    }
}
