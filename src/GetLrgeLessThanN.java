import java.io.Console;

/**
 * @author Satheesh Reddy
 *
 */
public class GetLrgeLessThanN {
long lessN(int number, int n){
	for(int i=number;i>0;i--){
	if(Integer.toString(i).indexOf(n)==-1){
		return i;
	}
	}
	return -1;
}
	
	public static void main(String[] args) {
		System.out.println("Enter the number and given number");
		Console c=System.console();
		int number=Integer.parseInt(c.readLine());
		
		
	}

}
