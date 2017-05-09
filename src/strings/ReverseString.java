package strings;

public class ReverseString {
	static void reverseString1(String s){
		StringBuffer sb= new StringBuffer(s);
		sb=sb.reverse();
		System.out.println(sb);
	}
	static void reverseString2(String s){
		for(int  i= s.length()-1;i>=0; i--){
			System.out.print(s.charAt(i));
		}
		
		
	}
	static String reverseString3(String s){
		if(s.length()==0||s==null){
			return "";
		}
		return (reverseString3(s.substring(1))+s.charAt(0));
	}
	public static void main(String[] args) {
		reverseString1("the");
		reverseString2("the");
		System.out.println("\n"+reverseString3("the"));

	}

}
