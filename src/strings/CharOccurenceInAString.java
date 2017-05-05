package strings;

public class CharOccurenceInAString {

	public static void main(String[] args) {
		String str="Satheesh";
		
		int len=str.length() - str.replace("e", "").length();
		System.out.println(len);
		System.out.println(str);
	}

}
