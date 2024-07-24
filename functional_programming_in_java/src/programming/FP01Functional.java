package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
//		printAllNumbersInListFunctional(Arrays.asList(12, 9, 13, 4, 5, 8, 9, 67));
//		printEvenNumbersInListFunctional(Arrays.asList(12, 9, 13, 4, 5, 8, 9, 67));
		printSquaresOfEvenNumbersInListFunctional(Arrays.asList(12, 9, 13, 4, 5, 8, 9, 67));
		
	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
//			   .forEach(FP01Functional :: print);
		       .forEach(System.out :: println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
//		       .filter(FP01Functional :: isEven)
			   .filter(number -> number % 2 == 0)
			   .forEach(System.out :: println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			   .filter(number -> number % 2 == 0)
			   .map(number -> number * number)
			   .forEach(System.out :: println);
	}
}
