package Generics;

import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) {

        Collection<Room> c = new ArrayList<>();  //Using generics
        c.add(new Room("Cambridge", "Suite", 6, 250.0));
//        c.add("Cambridge"); no working

        c.stream().forEach(e -> System.out.println(e.getName())); //Cambridge

        Collection c2 = new ArrayList(); //Raw type not a good idea
        c2.add(new Room("Cambridge", "Suite", 6, 250.0));
    }
}
