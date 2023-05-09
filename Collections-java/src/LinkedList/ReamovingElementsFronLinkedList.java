package LinkedList;

import java.util.LinkedList;

// remove the first element from the linkedlist
// remove the last element from the linked list
// remove specific element fron LinedList 
//  clear the linkedlist compleately
public class ReamovingElementsFronLinkedList {
	
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<>();
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		list.add("Panasa");
		list.add("Grapes");
		System.out.println("Added Elements in the List......."+list);
		// Remove First Element
		list.removeFirst();
		System.out.println("remove first element........."+list);
		
		// Remove Last element
		list.removeLast();
		System.out.println("Remove Last element......."+list);
		// remove specific Element
		list.remove(2);
		System.out.println("remove Specific element....."+list);
				
		// Clear the LinkedList
		
		list.clear();
		System.out.println("Clear the LinkedList....."+list);
	}

}
