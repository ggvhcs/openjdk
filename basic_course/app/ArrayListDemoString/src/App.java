import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strinList = new ArrayList<String>();

        strinList.add(0, "String added in firt position."); // add item in position 0.
        System.out.println(strinList.get(0)); // return first element.
        strinList.set(0, "Firt position updated."); // updated item in position 0.
        System.out.println(strinList.get(0)); // return first element.

        int howMany = strinList.size(); // how many items have.
        System.out.println("The List contains, " + howMany + " elements.");
    }
}
