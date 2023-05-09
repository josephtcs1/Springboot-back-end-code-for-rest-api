package JavaCollection;

import java.util.ArrayList;
import java.util.List;

// How to Create ArrayList from another collection using the
// ArrayList(Collection c) constructor
// How to Add all the elements  from existing collection to new
// ArrayList Using Add all method.

public class CreateArrayListFromCollectionExample {
public static void main(String[] args) {
	
	// Create Array list Object
	List<Integer> FistFivePrimeNumbers=new ArrayList<>();
	FistFivePrimeNumbers.add(1);
	FistFivePrimeNumbers.add(3);
	FistFivePrimeNumbers.add(5);
//	FistFivePrimeNumbers.add(7);
	FistFivePrimeNumbers.add(11);
	
	List<Integer> FisrtTenPrimeNumbers= new ArrayList<>(FistFivePrimeNumbers);
	List<Integer> NextFivePrimeNumbers=new ArrayList<>();
	NextFivePrimeNumbers.add(13);
	NextFivePrimeNumbers.add(17);
	NextFivePrimeNumbers.add(23);
	NextFivePrimeNumbers.add(29);
	NextFivePrimeNumbers.add(31);

	FisrtTenPrimeNumbers.addAll(NextFivePrimeNumbers);
	System.out.println(FisrtTenPrimeNumbers);
	
	
	
	
 	
}
}
