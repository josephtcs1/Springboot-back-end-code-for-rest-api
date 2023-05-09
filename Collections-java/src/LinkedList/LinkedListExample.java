package LinkedList;

import java.util.LinkedList;
// add()
// add(2,element)
// addFirst()
// addLast()

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	list.add("Banana");
	list.add("Apple");
	list.add("grapes");
	list.add("mango");
	System.out.println("Insertion List.......  " +list);
	// adding element specific position
	list.add(1, "Sapota");
	System.out.println("adding element......... " +list);
	
	//adding element bagging of linkedlist
	
	list.addFirst("Panasa");
	System.out.println("adding first element.... "+list);
	
	 // adding the element end of the linkedlist
	list.addLast("Goova");
	System.out.println("adding last element..... "+list);
}
}
