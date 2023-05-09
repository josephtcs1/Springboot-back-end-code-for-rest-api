package JavaCollection;

import java.util.ArrayList;
import java.util.List;

// remove()
// removeAll()
// clear()

public class RemoveElementsFromArrayList {
	public static void main(String[] args) {
		List<String> fruits =new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Graps");
		
		System.out.println(fruits);
		fruits.remove(2);
		System.out.println("Removal of fruit  "+fruits);
		
		fruits.remove("Mango");
		System.out.println("Removal of fruit"  +fruits);
		System.out.println(fruits);
		
		// Remove all fruit from existing in given collection
		List<String> subfruits =new ArrayList<>();
		subfruits.add("Goova");
		subfruits.add("Panasa");
		System.out.println(subfruits);
		
		subfruits.removeAll(subfruits);
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		
		
	}

}
