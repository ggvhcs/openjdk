//package LinkedListSENombres;

public class Nodo {
    // atributos.
    private String nombre;
    private Nodo siguiente;

    // constructor.
    public Nodo(String n) {
        this.nombre = n;
        this.siguiente = null;
    }

    public Nodo(String n, Nodo s) {
        this.nombre = n;
        this.siguiente = s;
    }

    // gets and sets
    public String getNombre() {
        return this.nombre;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setSiguiente(Nodo s) {
        this.siguiente = s;
    }

}
