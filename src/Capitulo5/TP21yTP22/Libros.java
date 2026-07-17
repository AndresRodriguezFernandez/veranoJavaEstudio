package Capitulo5.TP21yTP22;

public class Libros {
    protected String titulo;
    protected String autor;
    protected int anio;


    public Libros(String t, String a, int d) {
        titulo=t;
        autor=a;
        anio=d;
    }

    public void mostrar(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anio);
        System.out.println();
    }

    void mostrarPar(){
        System.out.println(titulo);
        System.out.println(anio);
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnio(){
        return anio;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setAnio(int anio){
        this.anio=anio;
    }

}
