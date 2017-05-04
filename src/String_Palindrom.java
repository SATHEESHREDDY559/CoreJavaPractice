import java.util.Scanner;

    public class String_Palindrom {
public void isPalindrom(String str){
	 
      char [] ch=str.toCharArray();
      int strlen=(ch.length)-1;
      boolean isPalindrom=true;

      for(int c=0; c<ch.length && strlen >= 0; c++,strlen--){
          if(ch[c]!=ch[strlen]){
              isPalindrom=false;
              break;
          }      
      }
      if(isPalindrom){
          System.out.println("The given string is a palindrom");
      }else{
          System.out.println("The given string is not a palindrom");
      }

     
}
        

        public static void main(String[] args) {
        	Scanner scanner= new Scanner(System.in);
        	 System.out.println("Enter the string");
             String inputStr =scanner.next();
             String_Palindrom sp= new String_Palindrom();
             sp.isPalindrom(inputStr);
        	

        }
    }