//package LinkedListSENombres;

public interface ILista {
    int longitug();

    void addFirst(String n);
    void addLast(String n);
    void insert(String n, int p);
    void rmFirst();
    void rmLast(String n);

    int search(String n);
    void print();
    boolean vacia();
}
