package ProgramacionClase.Unidad1;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //a
        boolean frio = false;
        System.out.println(!frio);

        //b
        boolean bueno = true;
        boolean bonito = true;
        boolean barato = true;
        boolean oportunidad = bueno && bonito && barato;
        System.out.println(oportunidad);

        //c
        boolean llueve = true;
        boolean riego = false;
        boolean mojado = llueve || riego;
        System.out.println(mojado);

    }
}
