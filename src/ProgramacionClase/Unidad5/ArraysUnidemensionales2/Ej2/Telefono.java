package ProgramacionClase.Unidad5.ArraysUnidemensionales2.Ej2;

public class Telefono {
    private Tipo tipo;
    private int tamano;
    private int[] llamadasRecientes;

    public Telefono(Tipo tipo, int tamano) {
        this.tipo = tipo;
        this.tamano=tamano;
        this.llamadasRecientes = new int[tamano];
    }

    public void apuntarLlamada(int llamada, int cont) {
        this.llamadasRecientes[cont] = llamada;
    }

    public void visualirzar() {
        if (this.llamadasRecientes != null) {
            System.out.println("------Llamadas recientes-------");
            for (int i = 0; i < llamadasRecientes.length; i++) {
                System.out.println(llamadasRecientes[i]);
            }
        }
    }

    public int getTamano() {
        return tamano;
    }

    public int[] getLlamadasRecientes() {
        return llamadasRecientes;
    }
}
