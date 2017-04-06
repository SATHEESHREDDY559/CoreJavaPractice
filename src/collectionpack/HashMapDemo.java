package collectionpack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		//hm.put(1,"abc");
		System.out.println(hm.put(4, "xyz"));
		hm.put(2, "xyz");
		hm.put(3, "pqr");
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		hm.put(3,"pqr");
		System.out.println(hm.put(3, "pqr"));
		Set s=hm.keySet();
		System.out.println(s);
		Collection coll=hm.values();
		System.out.println(coll);
		Set s2=hm.entrySet();
		System.out.println(s2);
		Iterator i1=s2.iterator();
		while(i1.hasNext()){
			Entry m1=(Entry)i1.next();
			System.out.println(m1.getKey()+"...."+m1.getValue());
			if((Integer)m1.getKey()==898){
				m1.setValue("Satheesh");
			}
			System.out.println(s2);
			System.out.println(hm);
			HashMap hm1= new HashMap();
			hm1.put(123,"zxc");
			hm1.putAll(hm);
		}
		
		
		
	}

}
