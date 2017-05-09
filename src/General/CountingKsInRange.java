package General;

import java.util.Scanner;

public class CountingKsInRange {

	private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter k value: ");
		int k = sc.nextInt();
		char ch=String.valueOf(k).charAt(0);
		System.out.println(ch);
		System.out.println("Enter range(N): ");
		int n=sc.nextInt();
		String s="";
		for(int i=0; i<=n;i++){
			s+=String.valueOf(i);
		}
		char charArray[] = s.toCharArray();
		for(char charK:charArray){
			if(ch==charK){
				count=count+1;
			}
		}
System.out.println(count);
	}

}
