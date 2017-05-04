import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		while(true){
		System.out.println("enter no.");
		int no=scanner.nextInt();
		int factor = 0;
		
		for (int i = 2; i <= no; i++) {
			if (no % i == 0) {
				
				factor=++factor;
				
			}

		}
		
		
	if (factor == 1) {
		System.out.println("prime no");
	}
	else
		System.out.println("not prime");
	}}
}
