import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strinList = new ArrayList<String>();
        System.out.println("Enter String values.");
        boolean done = false;
        String next = null;
        String answer;
        Scanner keyboard = new Scanner(System.in);

        while (!done) {
            System.out.println("Enter an string value:");
            next = keyboard.nextLine();
            strinList.add(next); // add item to stringList.

            System.out.println("More items for the list ?.");
            answer = keyboard.nextLine();
            if (!(answer.equalsIgnoreCase("yes")))
                done = true;
        }
        // iterate string List.
        for (String entry : strinList)
            System.out.println(entry);
    }
}
