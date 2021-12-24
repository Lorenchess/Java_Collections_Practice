package Set;

//Sets do not allow duplicated elements.

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Set<Room> rooms = new HashSet<Room>();
        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);

        rooms.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);
        //Comparing Oxford with Oxford
        //Oxford
        //Piccadilly
        //As you can see it prints only one Oxford since they are logically equivalent and a Set do not accept
        // duplicated elements, and also it prints in no order because the HashSet does not guaranty order...To
        // maintain order we need to implement a LinkedHashSet instead...

        Set<Room> orderRooms = new LinkedHashSet<>();
        orderRooms.add(piccadilly);
        orderRooms.add(oxfordDuplicate);
        orderRooms.add(victoria);

        orderRooms.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);
        //Piccadilly
        //Oxford
        //Victoria
        //It prints in order thanks to LinkedHashSet...

        //Other examples...

        Set<Room> immutableRooms = Set.of(piccadilly,oxford);
//        immutableRooms.add(victoria);
        //Exception in thread "main" java.lang.UnsupportedOperationException ...because the method Set.of() does not
        // allow to modify the Set later...

        //Other examples...

        Set<Room> unmodifiableCopy = Set.copyOf(orderRooms); //We cannot perform a modification add or remove

        unmodifiableCopy.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);
        //Piccadilly
        //Oxford
        //Victoria










    }
}
