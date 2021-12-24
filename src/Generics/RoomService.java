package Generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RoomService {

    private Collection<Room> inventory;

    public RoomService() {

       this.inventory = new LinkedHashSet<>();

    }

    public Collection<Room> getInventory(){

        // 3. Return the Room Inventory
        return new HashSet<>(this.inventory); //return a new copy to protect the original data/collection since
        // collections are mutable.
    }

    public void createRoom(String name, String type, int capacity, double rate) {

        // 4. Add a new Room to the Room Inventory using the provided parameters
        this.inventory.add(new Room(name, type, capacity, rate));
    }

    public void createRooms(Room[] rooms) {

        // 5. Add the Rooms provided in the Array to the Room Inventory
        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room) {

        // 6. Remove the provided Room from the Room Inventory
        this.inventory.remove(room);
    }

    public boolean hasRoom(Room room) {

        // 1. Returns a boolean that indicates if the Room Inventory contains a Room.

       return this.inventory.contains(room);

    }

    public Room[] asArray() {

        // 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.
        return this.inventory.toArray(new Room[0]);
    }

    public Collection<Room> getByType(String type){

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
         Collection<Room> copy = new HashSet<>(this.inventory); //creating a copy
         copy.removeIf(r -> !r.getType().equals(type)); //remove all the types that do not match removeIf()...
         return copy;

    }

}
