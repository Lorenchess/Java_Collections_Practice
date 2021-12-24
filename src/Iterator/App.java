package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);

        //Ways to remove elements and mutate the Collection.

        Iterator<Room> iterator = rooms.iterator();
        while(iterator.hasNext()){
            Room room = iterator.next();
            if(room.isPetFriendly()){
                iterator.remove();
            }
        }

        Collection<Room> removeRooms = new ArrayList<>();

        //Since mutating the Collection during an iteration is not allow, and we need to eliminate some rooms, we need
        // to create a new Collection and copy the rooms that fulfill the if statement room.isPetFriendly()

        for(Room room : rooms) {
            if(room.isPetFriendly()) {
                removeRooms.add(room);
            }
        }

        rooms.removeAll(removeRooms); //removing the rooms outside the foreach loop iteration...

        System.out.println(rooms);

    }
}
