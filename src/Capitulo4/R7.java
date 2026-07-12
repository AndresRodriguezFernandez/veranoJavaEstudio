/*RECURSIVIDAD: Imprimir los números del 1 al 5 implementandola*/
package Capitulo4;

public class R7 {
    void imprimir(int num) {
        if (num <= 5) {
            System.out.println(num);
            imprimir(num+1);
        }
    }

    public static void main(String[] args) {
        R7 r7 = new R7();
        int num = 1;
        r7.imprimir(num);
    }
}
