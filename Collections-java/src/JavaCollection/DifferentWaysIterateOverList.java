package JavaCollection;
import java.util.Arrays;
import java.util.List;

public class DifferentWaysIterateOverList {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("C","c++","Java","SpringBoot");
		// normal for loop
		for(int i=0;i<courses.size();i++) {
		System.out.println(courses.get(i));
		}
		
		for(String course:courses ) {
			System.out.println("Second Type   "+course);
		}
		// stream + lambda expression
		courses.stream().forEach(y->System.out.println(y));
		
		// java 8 ForEach + lambda expression
		courses.forEach((y)->System.out.println(y));
	}
	
	

}
