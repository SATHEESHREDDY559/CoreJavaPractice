import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeArrays {

	public static void main(String[] args) {
		int[] array1={1,2,3,4,5,6,7,8,9};
		int[] array2={10,11,12,13,14,15,16};
		
		  List<Integer> list1 = IntStream.of(array1).boxed().collect(Collectors.toList());
		  List<Integer> list2 = IntStream.of(array2).boxed().collect(Collectors.toList());
		  list1.addAll(list2);
		  System.out.println(list1);
		
	}

}
