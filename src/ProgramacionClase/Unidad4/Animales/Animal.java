package ProgramacionClase.Unidad4.Animales;

public class Animal {
    protected double peso;
    protected String tipoAnimal;

    public Animal(double peso, String tipoAnimal) {
        this.peso = peso;
        this.tipoAnimal = tipoAnimal;
    }

    public void emitir_sonido() {
        System.out.print("Sonido que emite: ");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                '}';
    }
}
