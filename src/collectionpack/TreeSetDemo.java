package collectionpack;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> s= new TreeSet<Employee>();
		//TreeSet s= new TreeSet(new CustomizeSortingOrder());
		Employee e=new Employee("Satheesh",1);
		s.add(e);
		s.add(new Employee("Abc",3));
	System.out.println(	s.add(new Employee("Bejjanki", 2)));
		
				
		/*s.add("z");
		s.add("x"); 
		s.add("99"); 
		s.add("y");
		*/
		//s.add(123);
		//s.add(null);
		System.out.println(s);
		

	}

}
