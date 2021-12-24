package TreeSet;

//A TreeSet is a set implementation that uses a binary search three to organize elements. Perform relational
// comparison of elements. Does not evaluate with equals.

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);

        NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

        numberTree.stream()
                .forEach(System.out::println);

//        500
//        1000
//        1500
//        2000
//        2500
//        3000

        //Numbers are stored in ascending order...because Integer stores by default in ascending order...but we can
        // use a descending order...

        numberTree.descendingSet()
                .stream()
                .forEach(System.out::println);
        //3000
        //2500
        //2000
        //1500
        //1000
        //500

        //Other methods headSet returns all elements less than the selected element
        numberTree.headSet(1750)
                .stream().forEach(System.out::println);

        //500
        //1000
        //1500

        //The tailSet does the opposite...
        numberTree.tailSet(1750)
                .stream().forEach(System.out::println);
        //2000
        //2500
        //3000

        //The method subSet() allow us to pick between two numbers...
        numberTree.subSet(1750, 2750)
                .stream().forEach(System.out::println);

        //2000
        //2500

        // The method lower() selects a proximity number...in this example the one just lower than 750
        System.out.println(numberTree.lower(750));
        //500

        //We also have the opposite
        System.out.println(numberTree.higher(750));
        //1000

    }
}
