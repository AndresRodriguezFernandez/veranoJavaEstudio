package ProgramacionClase.Unidad4.Animales;

public class Principal {
    public static void main(String[] args) {
        Perro p = new Perro(30, "perro", "Golden Retriever");
        Serpiente s = new Serpiente(5, "serpiente", false);

        p.emitir_sonido();
        System.out.println(p.toString());
        s.emitir_sonido();
        System.out.println(s.toString());
    }
}
