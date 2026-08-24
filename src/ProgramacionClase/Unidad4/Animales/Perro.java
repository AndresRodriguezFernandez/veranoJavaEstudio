package ProgramacionClase.Unidad4.Animales;

public class Perro extends Animal{
    private String raza;

    public Perro(double peso, String tipoAnimal, String raza) {
        super(peso, tipoAnimal);
        this.raza = raza;
    }

    @Override
    public void emitir_sonido() {
        super.emitir_sonido();
        System.out.print("Guau, guau");
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() + " raza: "+this.raza;
    }
}
