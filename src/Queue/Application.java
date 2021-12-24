package Queue;

//A Queue hold elements for processing and provides them in the order to be processed. The elements are added it to
// tail and removed from head(FIFO) although there are some alternatives as well.

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Application {

	public static void main(String[] args) {

		Guest john = new Guest("John", "Doe", false);
		Guest bob = new Guest("Bob", "Doe", false);
		Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
		Guest siri = new Guest("Siri", "Doe", true); //loyalty program

        Queue<Guest> checkinQueue = new ArrayDeque<>();
		checkinQueue.offer(john);
		checkinQueue.offer(bob);
		print(checkinQueue);

		//--Queue Contents--
		//0: John Doe (Head)
		//1: Bob Doe

		Guest guest = checkinQueue.poll(); //poll(will remove and retrieve the element)
		print(checkinQueue);
		//--Queue Contents--
		//0: Bob Doe (Head)
		System.out.println(guest);
        //John Doe

		System.out.println("---------------");

		checkinQueue.offer(sonia);
		checkinQueue.offer(siri);

		Guest guest1 = checkinQueue.peek(); //peek() will retrieve the element but will not remove the element
		print(checkinQueue);
		//--Queue Contents--
		//0: Bob Doe (Head)
		//1: Sonia Doe
		//2: Siri Doe

		System.out.println(guest1);
		//Bob Doe

		System.out.println("--------------------");

	  //Example with the PriorityQueue...this implementation allow us to provide a comparator that determinate the
		// order the elements are stored in the queue...It's a better approach to determinate the order to check in...

		Comparator<Guest> programComp = Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();

		Queue<Guest> checkingQueue1 = new PriorityQueue<>(programComp);
		checkingQueue1.add(john);
		checkingQueue1.add(bob);
		checkingQueue1.add(sonia);
		checkingQueue1.add(siri);

		print(checkingQueue1);
		//--Queue Contents--
		//0: Sonia Doe (Head) Sonia and Siri were placed first because they are in the loyalty program
		//1: Siri Doe
		//2: John Doe
		//3: Bob Doe

		//The Comparator method and reverse help to placed Sonia and Siri first








	}

	public static void print(Queue<Guest> queue) {

		System.out.format("%n--Queue Contents--%n");

		int x = 0;
		for(Guest guest : queue) {
			System.out.format("%x: %s %s %n", x++, guest.toString(), x == 1 ? "(Head)":"");
		}
		
		System.out.println("");
		
	}
}
