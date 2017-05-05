package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
	static void duplicatetWords(String str){
		Map<String, Integer> mapString = new HashMap<String, Integer>();
		
		String[] words=str.trim().split(" ");
		for(String word: words){
			if(mapString.containsKey(word)){
				mapString.put(word, mapString.get(word)+1);
			}else {
				mapString.put(word, 1);
			}
			
			}
		Set<String> wordsSet = mapString.keySet();
		int c=0;
		for(String word:wordsSet){
			if((c=mapString.get(word))>1){
				System.out.println(word+":"+c);
			}
		}
	}
	public static void main(String[] args) {
		duplicatetWords("Man is Man is man");

	}

}
