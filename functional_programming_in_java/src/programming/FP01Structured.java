package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(Arrays.asList(12, 9, 13, 4, 5, 8, 9, 67));
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(int number: numbers) {
			System.out.println(number);
		}
		
	}

}
