package Deque;

//A Deque is a double-ended queue that allows insertion or removal at either end (front or back). Extends the queue
// interface...Offers FIFO and last in, first out (LIFO), replaces java.util.Stack and reimplements several methods
// from Queue with alternate names.

import java.util.ArrayDeque;
import java.util.Deque;

public class Application {

	public static void main(String[] args) {

		Deque<String> messageStack = new ArrayDeque<>();
		messageStack.push("Message 1");
		print(messageStack);
		messageStack.push("Message 2");
		print(messageStack);
		messageStack.push("Message 3");
		print(messageStack);
		messageStack.push("Message 4");
		print(messageStack);

		//--Deque Contents--
		//0: Message 1 (Top)

		//--Deque Contents--
		//0: Message 2 (Top)
		//1: Message 1

		//--Deque Contents--
		//0: Message 3 (Top)
		//1: Message 2
		//2: Message 1

		//--Deque Contents--
		//0: Message 4 (Top)
		//1: Message 3
		//2: Message 2
		//3: Message 1

		System.out.println("---------------");

		System.out.println(messageStack.pop()); //Message 4 the method pop() removes the ele from the stack
		System.out.println(messageStack.pop()); //Message 3
		System.out.println(messageStack.peek()); //Message 2

		print(messageStack);
        //--Deque Contents--
		//0: Message 2 (Top)
		//1: Message 1

	}

	public static void print(Deque<String> deque) {

		System.out.format("%n--Deque Contents--%n");

		int x = 0;
		for(String msg : deque) {
			System.out.format("%x: %s %s %n", x++, msg, x == 1 ? "(Top)":"");
		}
		
		System.out.println("");
		
	}
}
