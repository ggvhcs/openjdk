package LinkedListSE;

public class NodoSE<T> {
    private T dato;
    private NodoSE<T> siguiente;

    // Constructor.
    public NodoSE(T d) {
        this.siguiente = null;
        this.dato = d;
    }

    //
    public NodoSE(T d, NodoSE<T> s) {
        this.siguiente = s;
        this.dato = d;
    }

    // gets and sets
    public T getDato() {
        return this.dato;
    }

    //
    public NodoSE<T> getSiguiente() {
        return this.siguiente;
    }

    //
    public void setDato(T d) {
        this.dato = d;
    }

    //
    public void setSiguiente(NodoSE<T> s) {
        this.siguiente = s;
    }
}
