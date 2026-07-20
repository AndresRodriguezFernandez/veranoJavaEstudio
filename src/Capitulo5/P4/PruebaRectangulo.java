package Capitulo5.P4;

import org.w3c.dom.css.Rect;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0, 0,5,5);
        Rectangulo r2 = new Rectangulo(7,9,2,3);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println("Perímetro del primer rectángulo: " + r1.Perimetro());
        System.out.println("Perímetro del seungdo rectángulo: " + r2.Perimetro());
        System.out.println("Área del primer rectángulo: " + r1.Area());
        System.out.println("Área del segundo rectángulo: " + r2.Area());
        r1.setX2(100);
        System.out.println("Períemtro del primer rectángulo mdoficado: " + r1.Perimetro());
    }
}
