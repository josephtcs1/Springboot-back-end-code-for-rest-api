package JavaCollection;

import java.util.ArrayList;
import java.util.List;

     //How to check ArrayList Is empty using the isEmpty() method
	// How find size of ArrayList Using the size() method
    // How to Assess the element that the particular index in a ArrayList using the get() method.
	// How to Modify the element that the particular index in a ArrayList using the set() method.
public class AsessElementsFromArrayList {
	
	public static void main(String[] args) {
		
		List<String> topProgrammingLanguage = new ArrayList<>();
		System.out.println("Is top progarmming language is empty  " +topProgrammingLanguage.isEmpty() );
		topProgrammingLanguage.add("Java");
		topProgrammingLanguage.add("python");
		topProgrammingLanguage.add("c");
		topProgrammingLanguage.add("C++");
		topProgrammingLanguage.add("Spring Boot");
		// Find the size the array list
		System.out.println("Is top programming " +topProgrammingLanguage.size());
		
		// Retrieve the element from the array list
		String BestProgrammingLanguage = topProgrammingLanguage.get(0);
		System.out.println("Best Programming Language  "+BestProgrammingLanguage);
		
		String SecondBestProgrmming =topProgrammingLanguage.get(3);
		System.out.println("second best programming language is  " +SecondBestProgrmming);
		
		// Modify the element at the given Index
		topProgrammingLanguage.set(3, "Hibernet");
		System.out.println(topProgrammingLanguage);
		
		
		
		
	}

}
