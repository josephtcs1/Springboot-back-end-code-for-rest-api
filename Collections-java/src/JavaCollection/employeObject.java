package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class employeObject {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee (1,"joseph","ku","jo@gmail.com",9));
		employee.add(new Employee (1,"kushi","ku","jo@gmail.com",9));
		employee.add(new Employee (1,"king","ku","jo@gmail.com",9));
		employee.add(new Employee (1,"Kiran","ku","jo@gmail.com",9));
		employee.add(new Employee (1,"Degitals","ku","jo@gmail.com",9));

 Collections.sort(employee,new Mysort());
 System.out.println(employee);
	}
 
}
class Mysort implements Comparator<Employee>{
 public int compare(Employee o1,Employee o2) {
	 return o1.getId();
 }
 
}
