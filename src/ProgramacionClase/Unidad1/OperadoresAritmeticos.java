package ProgramacionClase.Unidad1;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //a
        double multiplicacion =2.2*1.0;
        double resultado = multiplicacion + 5.0;
        System.out.println(resultado);

        //b
        int impuesto2 = (12/2)+(-8);
        System.out.println(impuesto2);

        //c
        int cociente = 16/3;
        int resto = 16%3;
        double cociente_decimal = 16/3;
        System.out.println(cociente + " " + cociente_decimal);

        //d
        int nueve = 9;
        int postIncremento = nueve++;

        //e
        int preIncremento = postIncremento++;
        System.out.println(preIncremento);

        //f
        int postdecremento = nueve--;
        System.out.println(postdecremento);
    }
}
