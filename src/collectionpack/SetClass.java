package collectionpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Set<Comparable> s= new HashSet<Comparable>();
 int a=123;
 Integer aa=new Integer(1234);
 s.add(a);
 s.add(aa);
 Float f=new Float(123.0F);
 String str ="abc";
 s.add(f);
 s.add(str);
 System.out.println(s);
 Set<Comparable> ss=new LinkedHashSet<Comparable>();
 ss.addAll(s);
 System.out.println(ss);
 Set<Comparable> sss=new TreeSet<Comparable>();
 sss.add(123);
 sss.add("String");
 System.out.println(sss);
	}

}
