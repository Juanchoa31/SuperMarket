package listassimples;

public class Nodo {
    private Producto dato;
    private Nodo enlace;

    public Nodo(Producto dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
}
