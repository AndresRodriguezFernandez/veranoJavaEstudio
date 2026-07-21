package Capitulo5.P5;

public class PruebaArticulo {
    public static void main(String[] args) {
        Articulo art = new Articulo("Zapatos", 49, 10);

        System.out.println(art.toString());
        art.setPrecio(39);
        System.out.println(art.toString());

    }
}
