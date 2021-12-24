package Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		
		Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);
		
		Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister));

		Iterator<Room> iterator = rooms.iterator(); //creates a new instance of Iterator, that will iterate over rooms

		//Typically, we use the Iterator with a while loop

		while (iterator.hasNext()) { //will iterate until the condition is false
			Room room = iterator.next(); //will iterate over the next element
			System.out.println(room.getName());
		}
		//Piccadilly
		//Cambridge
		//Westminister

		//The above is the old approach...Now let see with the foreach loop...

		for (Room room : rooms) {
			System.out.println(room.getName());
		}
         //Piccadilly
		//Cambridge
		//Westminister

		//As you can see we obtain the same result without much code. The hasNext() and the next() are called
		// automatically by the foreach method since rooms belongs to a Collection and Collection extends Iterator
		// interface, so it implements those methods...
			
	}
}
