package ProgramacionClase.Unidad4.Animales;

public class Serpiente extends Animal{
    private boolean esVenenosa;

    public Serpiente(double peso, String tipoAnimal, boolean esVenenosa) {
        super(peso, tipoAnimal);
        this.esVenenosa = esVenenosa;
    }

    @Override
    public void emitir_sonido() {
        super.emitir_sonido();
        System.out.print("Ssssssss");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Serpiente{" +
                "esVenenosa=" + esVenenosa +
                ", peso=" + peso +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                '}';
    }
}
