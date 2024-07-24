package Interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] reverse = IntStream.rangeClosed(0, arr.length - 1).map(i -> arr[arr.length - i - 1]).toArray();
		System.out.println(Arrays.toString(reverse));

	}

}
