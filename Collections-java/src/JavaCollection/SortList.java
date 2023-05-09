package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<Integer> sort = new ArrayList<Integer>();
		
		sort.add(10);
		sort.add(20);
		sort.add(30);
		sort.add(4);
		sort.add(4);
		sort.add(49);
		
		Collections.sort(sort);
		System.out.println(sort);
		Collections.reverse(sort);
		System.out.println(sort);
		
	
 	}

}
