package LinkedListSE;

public class LinkedListSE<T> {
    private NodoSE<T> head;
    private NodoSE<T> last;

    public LinkedListSE() {
        this.head = null;
    }

    //
    public boolean Vacia() {
        return head == null;
    }

    //
    public int Longitug() {
        int size = 1;
        if (Vacia())
            return 0;
        NodoSE<T> cursor = head;
        while (cursor.getSiguiente() != null) {
            cursor = cursor.getSiguiente();
            size++;
        }
        return size;
    }

    //
    public T Obtener(int p) throws Exception {
        T result = null;
        if (p >= 0 && p < Longitug()) {
            NodoSE<T> cursor = head;
            int count = 0;
            while (count < p) {
                cursor = cursor.getSiguiente();
                count++;
            }
            return result;
        } else
            throw new Exception("Posicion Invalida.");

    }

    //
    public void Adicionar(T n) {
        NodoSE<T> nuevo = new NodoSE<T>(n);
        if (Vacia()) {
            head = nuevo;
        } else {
            NodoSE<T> cursor = head;
            while (cursor.getSiguiente() != null) {
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(nuevo);
        }
    }
}
