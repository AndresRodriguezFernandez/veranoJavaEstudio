package Capitulo6.P6;



public class ColaLista {
    protected Nodo frente;
    protected Nodo fin;

    public ColaLista() {
        frente=fin=null;
    }

    public void insertar(Producto elemento){
        Nodo a;
        a = new Nodo(elemento);
        if (colaVacia()){
            frente=a;
        }else {
            fin.siguiente=a;
        }
        fin = a;
    }

    public Producto quitar() throws Exception {
        Producto aux;
        if (!colaVacia()){
            aux=frente.elemento;
            frente=frente.siguiente;
        }else {
            throw new Exception("Eliminar una cola vacia");
        }
        return aux;
    }

    public Object frenteCola() throws Exception {
        if (colaVacia()){
            throw new Exception("Error: cola vacía");
        }
        return (frente.elemento);
    }

    public boolean colaVacia(){
        return (frente == null);
    }
}
