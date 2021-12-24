package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, manchester, oxford, victoria));

        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);

        //Imperative style of code...when we specify exactly how the code should behave...

        for (Room room: rooms) {
            if(room.isPetFriendly()){
                System.out.println(room.getName());
            }
        }

        //Functional style we tell the code what we want to achieve but it figures how to do it...Stream is like a
        // pipeline that do not store data, the data flows ...

        rooms.stream() //first we need a source of elements that can flow throughout the stream rooms.stream()...
                .forEach(r -> {
                    if(r.isPetFriendly()){
                        System.out.println(r.getName());
                    }
                });

        //Another example

        rooms.stream()
                .filter(room -> room.isPetFriendly())
                .forEach(room -> System.out.println(room.getName()));

        //Another example using Method Reference ...

        rooms.stream()
                .filter(Room ::isPetFriendly) //we get the type and the method we want to call without the parenthesis
                .forEach(room -> System.out.println(room));

        //Creating a new Collection and adding only the pet friendly

        Collection<Room> petFriendlyRooms = new ArrayList<>();
        rooms.stream()
                .filter(Room::isPetFriendly)
                .forEach(room -> petFriendlyRooms.add(room));

        petFriendlyRooms.stream()
                .forEach(r -> System.out.println(r.getName()));

        //Another approach to the above example...

        Collection<Room> myPetFriendlyRooms = rooms.stream()
                .filter(Room::isPetFriendly)
                .collect(Collectors.toList());
        myPetFriendlyRooms.stream()
                .map(r -> r.getName())
                .forEach(System.out::println);

        double total = myPetFriendlyRooms.stream()
                .mapToDouble(Room::getRate)
                .sum();
        System.out.println(total); //450.0




    }
}
