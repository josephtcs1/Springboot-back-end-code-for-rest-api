package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

public class NeedOfCollections {
	public static void main(String[] args) {
		Collection<String> addfruits =new ArrayList<String>();
		addfruits.add("Banana");
		addfruits.add("Apple");
		addfruits.add("Mango");
		addfruits.add("Grapes");
		System.out.println(addfruits);
		
		addfruits.remove("Apple");
		System.out.println(addfruits);
	
		System.out.println(addfruits.contains("Mango"));
		addfruits.forEach(element->{
		System.out.println(element);
		});
		
		addfruits.clear();
		System.out.println(addfruits);
		}
	}


