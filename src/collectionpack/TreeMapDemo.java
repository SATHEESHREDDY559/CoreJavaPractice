package collectionpack;
import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee e1=new Employee("Sa",1);
		Employee e2=new Employee("Sat",25);
		Employee e3=new Employee("Sat",26);
		Employee e4=new Employee("Sath",89);
		Employee e5=new Employee("Satheesh",23);
		
		TreeMap<Employee,Float> s= new TreeMap<Employee,Float>();
		
		s.put(e5, (float) 11.00);
		s.put(e3, (float) 22.00);
		s.put(e4, (float) 111.00);
		s.put(e2, (float) 222.00);
		s.put(e5, (float) 11.00);
		s.put(e1, (float) 222.00);
		System.out.println(s);
		System.out.println("--------------------------");
		Set<Entry<Employee,Float>> set=s.entrySet();
		Iterator<Entry<Employee, Float>> iterator= set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<collectionpack.Employee, java.lang.Float> entry = (Map.Entry<collectionpack.Employee, java.lang.Float>) iterator
					.next();
			System.out.println("\n"+entry.getKey()+":"+entry.getValue());
		}
		
		
		
			
		

	}

}
