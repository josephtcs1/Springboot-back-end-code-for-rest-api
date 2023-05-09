package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CostomerToMap {
public static void main(String[] args) {
	Customer c1=new Customer("joseph","32","dkj356nnm",37653433);
	Customer c2=new Customer("joseph","23","dkj3k56nnm",37653243);
	Customer c3=new Customer("joseph","274","dkj3kkj56nnm",37653);
	Customer c4=new Customer("joseph","272","dkj356nsdfnm",3965983);
	Customer c5=new Customer("joseph","273","dkj356nnmdhf",375653);
	Customer c6=new Customer("joseph","2731","dkj356nnmdg",3765376);
	Customer c7=new Customer("joseph","217","dkj356nnmfdd",3765356);
	List<Customer> list =Arrays.asList(c1,c2,c3,c4,c5,c6,c7);
	Map<Integer,Customer> map= new HashMap<>();
	 // before java 8
	for(Customer customer:list) {
		map.put(customer.getBalence(),customer);
		map.forEach((k,v)->System.out.println(k+"  "+v));
		
	}
	
	// java 8
	Map<String,Customer> javaMap=list.stream().collect(Collectors.toMap(Customer ::getPanNo, Function.identity()));
	javaMap.forEach((k,v)->System.out.println(k+"  "+v));
	
	
	
	   Map<Integer,Customer>  mapping=list.stream().collect(Collectors.toMap(Customer :: getBalence, Function.identity()));
	   mapping.forEach((k,v)->System.out.println(k+ "  "+v));
	   
	   Map<String,Customer> mapp=list.stream().collect(Collectors.toMap(Customer :: getAge, Function.identity()));
	   mapp.forEach((j,k)->System.out.println(j+" "+k));

}
}
