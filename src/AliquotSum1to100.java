

/**
 * @author Satheesh
 
 * AliquotSum1to100.java
 *
 */
public class AliquotSum1to100 {

	public static void main(String[] args) {

		// declaring a flag variable
		boolean isPerfect = false;
		System.out.println("Perfect Numbers b/w 1 and 100");

		// to print the perfect number b/w 1 and 100
		for (int num = 1; num <= 100; num++) {
			isPerfect = isPerfectNum(num);
			if (isPerfect) {
				System.out.println(num);
			}
		}
	}

	// to check the numbers is perfect number or not b/w 1 and 100 by
	// calculating aliquot sum
	public static boolean isPerfectNum(int i) {
		boolean isPerfect = false;
		int aliquotsum = 0;
		for (int j = 1; j <= i - 1; j++) {
			if (i % j == 0) {
				aliquotsum += j;
			}
		}
		if (aliquotsum == i) {
			isPerfect = true;
		}
		return isPerfect;
	}
}
