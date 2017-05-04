package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RepeatingLetter {
	public void repeatingLetter(String str){
		
		char[] ch=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
	for(char c:ch){
		if(map.containsKey(c)){
			
			map.put(c, map.get(c)+1);
		}
		else{
			map.put(c, 1);
		}
	}
	Set<Character> set= map.keySet();
	
	for(Character c:set){
		if(map.get(c)>1){
			System.out.println(c+"="+map.get(c));
			
		}
	}
	
			
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner scan= new Scanner(System.in);
		String str=scan.nextLine();
		RepeatingLetter s= new RepeatingLetter();
	s.repeatingLetter(str);
		scan.close();

	}

}
