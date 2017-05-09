package strings;

import java.util.LinkedHashMap;

public class LongSubString {
	public static void main(String[] args) {
		String s = "abcdcdafdsfkljs";
		LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		char[] charArray = s.toCharArray();
		String longestSubStrin = "";
		int longestSubStringLength = 0;

		for (int i = 0; i <= charArray.length - 1; i++) {
			char ch = charArray[i];
			if (!charMap.containsKey(ch)) {
				charMap.put(ch, i);

			} else {
				i = charMap.get(ch);
				charMap.clear();
			}
			if (longestSubStringLength < charMap.size()) {
				longestSubStringLength = charMap.size();
				longestSubStrin = charMap.keySet().toString();
			}

		}
		System.out.println(longestSubStrin);
	}

}
