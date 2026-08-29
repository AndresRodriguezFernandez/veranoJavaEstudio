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
            for (int i = 0; i < llamadasRecientes.length; i++) {
                if (cont <= 3) {
                    if (llamadasRecientes[i] != 0) {
                        System.out.println(llamadasRecientes[i]);
                    }
                }else {
                    System.out.println(llamadasRecientes[i%3]);
                }

            }
        }
    }

    public int[] getLlamadasRecientes() {
        return llamadasRecientes;
    }
}
