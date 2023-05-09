package LinkedList;

import java.util.LinkedList;

// how to get first element in the linked list
// how to get last element in the linked list
// how to get the element at given index in the LinkedList 
// how to get all elements in the linkedList
public class RetriveLinkedListExapmles {
	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<>();
	list.add("Banana");
	list.add("Mango");
	list.add("Panasa");
	list.add("goova");
	System.out.println("adding all elements......"+list);
	//  getting first element in the linked list using getList()
	
	String fruits=list.getFirst();
	System.out.println("get first list...."+fruits);
	
	//  getting first element in the linked list using getList()
	
	String GettingLastEmlement = list.getLast();
	System.out.println("getting last element.........." +GettingLastEmlement);
	
	//  getting the element at given index in the LinkedList 
	String GettingValueFromIndex=list.get(2);
	System.out.println("getting last element......"+GettingValueFromIndex);
	
	//  get all elements in the linkedList
	for(String GettAllElement:list) {
		System.out.println(GettAllElement);
		
		
		
	}
	// ForEach lamda expression
			list.forEach((y)->{System.out.println("ForEachLOOP......."+y);});
			
   // Streams + ForEach
			
			list.stream().forEach(y->{
				System.out.println("Streams + ForEach...."+y);
			});



	
	
	

}
}
