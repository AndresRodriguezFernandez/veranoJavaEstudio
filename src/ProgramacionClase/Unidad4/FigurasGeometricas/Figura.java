package ProgramacionClase.Unidad4.FigurasGeometricas;

public abstract class Figura {
    protected int posicionX;
    protected int posicionY;

    public Figura(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public abstract double calcularPerimetro();

    public abstract void imprimir();
}
