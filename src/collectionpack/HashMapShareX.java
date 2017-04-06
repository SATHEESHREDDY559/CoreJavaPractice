package collectionpack;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapShareX {
	public static void main(String arg[]){	
//HashMap<String, ShareX> hm= new HashMap<String, ShareX>();
LinkedHashMap<String, ShareX> hm= new LinkedHashMap<String, ShareX>();

for(int i=0;i<10;i++){
	ShareX sh= new ShareX();
	hm.put("Share"+(i+1), sh);
	
}
System.out.println(hm);
Set<Entry<String, ShareX>> set = hm.entrySet();
	for(Entry<String, ShareX> e:set){
		System.out.println(e.getKey());
		for(int j=0;j<10;j++){
			System.out.println("Day "+(j+1)+"   "+e.getValue().getSharex(new Date()));
		}
	}
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	}
	
}
