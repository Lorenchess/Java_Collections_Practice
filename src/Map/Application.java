package Map;

//Map stores key and value pairs, it's like a dictionary the word represents the key and the definition the value. A
// map stores associations between keys and values. Each key links to exactly one value to form a key-value pair
// known as an entry. Keys must be unique, and retrieving values by key is fast. Map does not extend the Collection
// interface. Map contains two generic types of pair <K,V>
//Collections view are part of Map, and it retrieves parts of the Map as a Collection. Collection view is backed by
// the Map and reflects changes made on the map.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);

		Map<Room, Guest> assignments = new HashMap<>();
		assignments.put(oxford, maria);
		assignments.put(piccadilly, john);

		System.out.println("Oxford: " + assignments.get(new Room("Oxford","Suite", 5, 225.0)));
		System.out.println("Piccadilly: " + assignments.get(piccadilly));
		//Oxford: Maria Doe
		//Piccadilly: John Doe

		Guest guest = assignments.put(piccadilly, assignments.remove(oxford));
		assignments.putIfAbsent(oxford, guest);

		System.out.println("Oxford: " + assignments.get(new Room("Oxford","Suite", 5, 225.0)));
		System.out.println("Piccadilly: " + assignments.get(piccadilly));
        //Oxford: John Doe
		//Piccadilly: Maria Doe

		System.out.println("--------------");

		//Set<Map.Entry<Room, Guest>> collectionView = assignments.entrySet();

		for (Map.Entry<Room, Guest> entry : assignments.entrySet()){
			Room r = entry.getKey();
			Guest g = entry.getValue();
			System.out.format("%s : %s%n", r.getName(), g.getFirstName());
			//Oxford : John
			//Piccadilly : Maria
		}


	}

}
