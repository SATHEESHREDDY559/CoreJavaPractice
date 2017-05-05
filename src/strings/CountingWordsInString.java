package strings;

import java.util.HashMap;
import java.util.Map;

public class CountingWordsInString {
	static void countWords(String str){
		String[] s=str.trim().split(" ");
		System.out.println(s.length);
		for(String ss:s)
		System.out.println(ss);
	}
	public static void main(String[] args) {
		countWords("Hi, How are you?");
	}

}
