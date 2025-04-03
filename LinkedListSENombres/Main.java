//package LinkedListSENombres;

public class Main {
    public static void main(String[] args) throws Exception {
        //Nodo nuevo = new Nodo("scariote");
        //Lista lista = new Lista(nuevo);
        //
        Lista lista = new Lista();
        lista.addLast("scariote");
        lista.addLast("pedro");
        lista.addLast("juan");
        lista.addLast("job");
        lista.addLast("josue");
        lista.addLast("jonas");
        lista.addLast("sacarias");
        //Lista l = new Lista();// lista vacia. --> uncomment this line and comment all before for test empty list.
        lista.print();
        //System.out.println("Hello, TDA listSE size!. --> " + lista.longitug());
        //lista.rmLast("josue");
        lista.rmFirst(); // cursor que antes apuntaba a inicio, ahora apunta a inicio.siguiente.
        System.out.println("Hello, TDA listSE size!. --> " + lista.longitug());
    }
}
