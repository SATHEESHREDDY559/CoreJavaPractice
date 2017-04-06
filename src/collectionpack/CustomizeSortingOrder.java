package collectionpack;

import java.util.Comparator;

public class CustomizeSortingOrder implements Comparator<Object> {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String s1=(String)arg0;
		String s2=(String)arg1;
		return -(s1.compareTo(s2));
		//return -9;
		//return 9;
		//return 1;
		/*Integer i1=(Integer)arg0;
		Integer i2=(Integer)arg1;
		if(i1<=i2)
		return 1;
		else
			return -1;*/
				
		
		
	}
	
	
	

}
