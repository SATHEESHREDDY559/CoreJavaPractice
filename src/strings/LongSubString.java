package strings;

import java.util.HashMap;
import java.util.Map;

public class LongSubString {
	public static void main(String[] args) {
		String s="abcedacdef";
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		char[] ch=s.toCharArray();
		String sub="";
		for(char c:ch){
			if(charMap.containsKey(c)){
				charMap.put(c, charMap.get(c)+1);
				
			}
			else 
				charMap.put(c, 1);
			
		}
		System.out.println(charMap);
	}

}
