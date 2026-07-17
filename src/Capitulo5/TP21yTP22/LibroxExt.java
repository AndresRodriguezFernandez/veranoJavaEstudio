package Capitulo5.TP21yTP22;

public class LibroxExt extends Libros{
    private String editorial;

    public LibroxExt(String t, String a, int d, String e){
        super(t, a, d);
        editorial=e;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println(editorial);
        System.out.println();
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String e){
        editorial=e;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String t){
        titulo=t;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String a){
        autor=a;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int d){
        anio=d;
    }
}
