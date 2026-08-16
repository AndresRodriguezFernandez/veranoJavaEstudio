package ProgramacionClase.Unidad1;

public class OperadoresComparacion {
    public static void main(String[] args) {
        int edadJuan = 6;
        int edadPedro = 6;
        int edadJulio = 21;
        int contador = 14;
        double hipotenusa =206.73;
        double cateto1 = 13.2;
        double cateto2 = 5.7;

        //a
        if (edadJuan < 18) {
            System.out.println("Es true que Juan es menor de edad.");
        }
        //b
        if (edadJuan == edadPedro) {
            System.out.println("Es true que Juan tiene la misma edad que Pedro");
        }
        //c
        if (edadJulio > edadPedro){
            System.out.println("Es true que Julio tiene más edad que Pedro");
        }
        //d
        if (!(Math.pow(hipotenusa, 2) == (Math.pow(cateto1+cateto2, 2)))) {
            System.out.println("Es false que la hipotenusa al cuadrado es igual a la suma de sus\n" +
                    "catetos al cuadrado.");
        }
        //e
        if (cateto1 > cateto2) {
            System.out.println("Es true que el cateto1 es mayor que el cateto2.");
        }
        //f
        if (!(contador == 8)){
            System.out.println("Es false que contador es igual a 8.");
        }
        //g
        if (contador != 8) {
            System.out.println("Es true que contador es distinto a 8");
        }
    }
}
