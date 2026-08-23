package ProgramacionClase.Unidad4.FigurasGeometricas;

public class Circulo extends Figura{
    protected double radio;

    public Circulo(int posicionX, int posicionY, double radio) {
        super(posicionX, posicionY);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.radio;
    }

    @Override
    public void imprimir() {
        System.out.println("Perímetro: " + this.calcularPerimetro());
        System.out.println("Posición: "  +posicionX + ","+posicionY);
    }
}
