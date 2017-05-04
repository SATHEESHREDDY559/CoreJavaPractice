
public class ArrayMaxSum {

	public static void main(String[] args) {
		int MaxSum = 0;
		int[] arrays = { 20, 3, 4, 5, 10, 7, 8, 9 };
		for (int i = 0; i <= arrays.length; i++) {
			int sum = 0;
			for (int j = i + 2; j < arrays.length; j++) {
				sum = arrays[i] + arrays[j];
				if (sum > MaxSum) {
					MaxSum = sum;
				}

			}
		}

		System.out.println(MaxSum);

	}

}
