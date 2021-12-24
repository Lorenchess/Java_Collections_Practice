package List;

//List is an order collection that provides positional insertion, removal, and access to a sequence of elements.
// Array and linked-based implementations. Allows duplicated elements, use indexes to work with position and is zero
// index based.

//ArrayList implementation internally baked an array but resizable, adding elements can cause performance issues if we
// need to add
// multiple elements in the middle but "reading" and "retrieving" an elements is relative fast since we can use
// "random access" and get the element by its position.

//LinkedList implementation uses the Doubly Linked List as its internal structure instead of an array it uses Nodes
// that contains references that linked objects together into a sequence that forms the linkedlist. Each node hold a
// reference/pointer to the next node and the previous node. In some situations it performs a better performance for
// this operations. However, a linkedlist is not ideal for retrieving an elements becuase we need to traverse/iterate
// to all the elements that proceed the position of the element we want to insert.

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);

        List<Guest> checkingList = new ArrayList<>(100);
        checkingList.add(john);
        checkingList.add(maria);

        print(checkingList);
        //--List Contents--
        //0: John Doe
        //1: Maria Doe

        //Now we need to add sonia at the head of the list because she is member of the loyalty program

        checkingList.add(0,sonia);
        print(checkingList);
        //--List Contents--
        //0: Sonia Doe
        //1: John Doe
        //2: Maria Doe

        //Maria wants to join the loyalty program
        checkingList.get(2).setLoyaltyProgramMember(true);

        //Now Siri comes, and she is also a loyal member, so we need to add maria and Siri ahead John...
        checkingList.addAll(1,List.of(maria,siri));

        print(checkingList);
        //--List Contents--
        //0: Sonia Doe
        //1: Maria Doe
        //2: Siri Doe
        //3: John Doe
        //4: Maria Doe
        //As you see we need to remove Maria from the last position...

        checkingList.remove(checkingList.size() - 1);
        print(checkingList);
        //--List Contents--
        //0: Sonia Doe
        //1: Maria Doe
        //2: Siri Doe
        //3: John Doe

        //Now John wants to know his position in the list
        System.out.println("John is in the " + (checkingList.indexOf(john) + 1) + " position");
        //John is in the 4 position

    }

    public static void print(List<Guest> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }

    }
}
