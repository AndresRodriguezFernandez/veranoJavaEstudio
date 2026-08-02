package Capitulo7.P1;

public class Libro {
    protected String isbn;
    protected String titulo;
    protected String autor;
    protected int numPags;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "El libro " + this.titulo + " con ISBN " + this.isbn + ", creado por el autor "
                + this.autor + " tiene " + this.numPags + " páginas.";
    }
}
