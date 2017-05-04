import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class NoOfCharsInString {

	public static void main(String[] args) {
		HashMap<Character,Integer> hashMap= new HashMap<Character, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		char[] c=sc.next().toCharArray();
		for(char ch:c){
			if(hashMap.containsKey(ch)){
				hashMap.put(ch,hashMap.get(ch)+1);
			}
			else{
				hashMap.put(ch,1);
			}
		}
		System.out.println(hashMap);
	}

}
