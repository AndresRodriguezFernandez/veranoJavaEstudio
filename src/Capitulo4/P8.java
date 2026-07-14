package Capitulo4;

public class P8 {
    static String invertir(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        }
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {
        String cadena = "hola";
        System.out.println(invertir(cadena));
    }
}
