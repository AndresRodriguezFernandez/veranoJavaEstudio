package ProgramacionClase.Unidad5.ArraysUnidemensionales2.EJ3;

public class Urna {
    private int[] contador = new int[49];

    public int sacar_bola() {
        int bola = (int) (Math.random()*(49-0)+0);
        return bola;
    }

    public void contabilizar_bola(int bola) {
        this.contador[bola] +=1;
    }

    public void visualizar() {
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] != 0) {
                System.out.println("La bola "+i+" ha salido "+contador[i]+" veces.");
            }
        }
    }
}
