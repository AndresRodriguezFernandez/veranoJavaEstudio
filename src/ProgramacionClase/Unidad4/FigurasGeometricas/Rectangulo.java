package ProgramacionClase.Unidad4.FigurasGeometricas;

public class Rectangulo extends Figura{
    protected double base;
    protected double altura;

    public Rectangulo(int posicionX, int posicionY, double base, double altura) {
        super(posicionX, posicionY);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                '}';
    }

    @Override
    public double calcularPerimetro() {
        return 2*(this.base+this.altura);
    }

    @Override
    public void imprimir() {
        System.out.println("Perímetro: " + this.calcularPerimetro());
        System.out.println("Posición: " + posicionX+","+posicionY);
    }
}
