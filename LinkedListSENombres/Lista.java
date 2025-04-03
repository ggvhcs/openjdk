//package LinkedListSENombres;

import java.util.NoSuchElementException;

public class Lista implements ILista {
    private Nodo first;
    private Nodo last;
    private int size;

    public Lista() {
        this.first = null;
        this.size = 0;
        this.last = null;
    }

    public Lista(Nodo n) {
        this.first = n;
        this.size++;
        this.last = null;
    }

    @Override
    public void addFirst(String n) {
        Nodo nuevo = new Nodo(n);
        if (vacia())
            first = last = nuevo;
        else {
            Nodo cursor = first;
            while (cursor.getSiguiente() != null) {
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(nuevo);
            this.size++;
        }
    }

    @Override
    public void addLast(String n) {
        Nodo nuevo = new Nodo(n);
        if (vacia())
            first = last = nuevo;
        else {
            Nodo cursor = first;
            while (cursor.getSiguiente() != null) {
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(nuevo);
            this.size++;
        }
    }

    @Override
    public void print() {
        Nodo cursor = first;

        if (vacia())
            System.out.println("!Lista Vacia.");
        else {
            while (cursor.getSiguiente() != null) {
                cursor = cursor.getSiguiente();
                System.out.println("Hello, TDA listSE!:--> " + cursor.getNombre());
            }
        }
    }

    @Override
    public boolean vacia() {
        return first == null;
    }

    @Override
    public int longitug() {
        return size;
    }

    @Override
    public void insert(String n, int p) {

    }

    @Override
    public void rmFirst() {
        Nodo cursor = first;
        String nameDelete =first.getNombre();
        if (vacia())
            throw new NoSuchElementException();
        cursor = cursor.getSiguiente().getSiguiente();
        this.size--;
        System.out.println("Name Deleted --> "+nameDelete);
    }

    @Override
    public void rmLast(String n) {
        Nodo cursor = first;
        if (vacia())
            System.out.println("!Lista Vacia.");
        else {
            while (cursor.getSiguiente() != null) {
                cursor = cursor.getSiguiente();
                String currentName = cursor.getNombre().toString();
                if (currentName == n) {
                    System.out.println(currentName);
                    // int ant = (int)cursor.getSiguiente()-2;
                }
            }
        }
    }

    @Override
    public int search(String n) {
        int result = 0;
        return result;
    }
}
