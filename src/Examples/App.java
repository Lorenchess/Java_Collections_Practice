package Examples;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Set a = new HashSet();
        List b = new ArrayList();

        //You need to use the most abstract generic possible for the "variable type" (Collection, List... no ArrayList)
        // so you can switch the implementation type without consequences.

        Collection<String> c = new ArrayList<>();

        c.add("chess");
        c.add("Java");
        c.add("JavaScript");
        c.add("Java");

        System.out.println(c); //[chess, Java, JavaScript, Java]

        Collection<String> favoriteThings = new HashSet<>(c); //passing to the constructor the prev collection

        System.out.println(favoriteThings); //[Java, chess, JavaScript] since HashSets do not allow duplicated elements

        //You need to use the most abstract generic possible for the "variable type" (Collection, List... no ArrayList)
        // so you can switch the implementation type without consequences.
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers); //[1, 2, 3]

        List<Integer> myInt = new LinkedList<>(numbers);

        System.out.println(myInt); //[1, 2, 3]


    }
}
