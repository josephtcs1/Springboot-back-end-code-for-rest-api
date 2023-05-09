package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		// List Allows you add duplicate element
		list.add("elements1");
		list.add("elements1");
		list.add("elements2");
		list.add("elements2");
		System.out.println(list);
		
		// List Allows null values
		 list.add(null);
		 list.add(null);
      System.out.println(list);
		 // Insertion order
      
		list.add("element 1"); //0
		list.add("element 2"); //1
		list.add("element 3"); //2
		list.add("element 4"); //3
		list.add("element 5"); //4
		System.out.println(list);
		
		//Assess elelmet from the list
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
	}
	
	

}
