package collectionpack;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList al = new ArrayList();
	al.add("AB");
	al.add("xy");
	al.add("pq");
	al.add("uv");
	
	System.out.println(al);
	
	Collections.sort(al);
	System.out.println(al);
	
	Collections.sort(al, new CustomizeSortingOrder());
	
	System.out.println(al);
	

	}

}
