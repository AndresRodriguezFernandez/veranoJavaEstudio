package Capitulo4;

public class P7 {
    static int cont = 0;
    static int cadena(String cadA, String cadB) {
        if (cadA.contains(cadB)) {
            cont++;
        }else {
            return cont;
        }
        return cadena(cadA.substring(cadA.indexOf(cadB)+1), cadB);
    }

    public static void main(String[] args) {
        System.out.println(cadena("holo", "o"));

    }
}
