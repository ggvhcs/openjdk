
//package llju;
import java.util.LinkedList;

public class LinkedListSE {
    public static void main(String[] args) throws Exception {
        LinkedList<String> fname = new LinkedList<String>();
        LinkedList<String> lname = new LinkedList<String>();
        LinkedList<String> nombre = new LinkedList<String>();

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        //
        fname.add("pedro");// add pedro.
        fname.addFirst("juan");
        fname.addLast("adonai");
        System.out.println(lname.size()); // print size of list.
        //
        lname.addLast("holi");// add santo.
        lname.addLast("virgen maria");
        lname.addLast("espiritu santo");
        System.out.println(lname.contains("holi")); // print true if contain holi.
        //
        lname.removeLast();// remove ultimo item.
        lname.removeFirst();// remove primer elemento.
        lname.remove(0);// remove primer elemento, with index as parameter.
        //
        lname.addLast("Dios");
        lname.addLast("Jesus");
        lname.addLast("Virgen Maria");
        lname.addLast("Espiritu Santo");
        lname.addLast("Arcangel Miguel");
        lname.addLast("Padre Pio");

        System.out.println(lname);

        // add method.
        numbers.addLast(1);
        numbers.addLast(2);
        numbers.addLast(3);
        numbers.addFirst(0);

        nombre.addAll(fname);
        nombre.addAll(lname);
        String characters = nombre.toString();// save nombre in to array var, como un char.
        System.out.println(characters);

        System.out.println(numbers);
    }
}
