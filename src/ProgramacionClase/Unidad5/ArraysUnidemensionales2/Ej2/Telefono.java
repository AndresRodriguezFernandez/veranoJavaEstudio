package ProgramacionClase.Unidad5.ArraysUnidemensionales2.Ej2;

public class Telefono {
    private Tipo tipo;
    private int[] llamadasRecientes = new int[3];
    private int cont = 0;

    public Telefono(Tipo tipo) {
        this.tipo = tipo;
    }

    public void apuntarLlamada(int llamada) {
        this.llamadasRecientes[cont%3] = llamada;
        cont++;
    }

    public void visualizar() {
        if (this.llamadasRecientes != null) {
            System.out.println("------Llamadas recientes-------");

            if (cont <= 3) {
                for (int i = 0; i < cont; i++) {
                    if (llamadasRecientes[i] != 0) {
                        System.out.println(llamadasRecientes[i]);
                    }
                }
            }else {
                int inicio = cont % 3;
                for (int k = 0; k < 3; k++) {
                    System.out.println(llamadasRecientes[(inicio+k)%3]);
                }
            }
        }
    }

    public int[] getLlamadasRecientes() {
        return llamadasRecientes;
    }
}
