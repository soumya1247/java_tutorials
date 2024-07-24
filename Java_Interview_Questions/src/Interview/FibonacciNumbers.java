package Interview;

import java.util.stream.Stream;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("Fibonacci of " + n + " numbers");
		Stream.iterate(new int[] {0, 1}, fib -> new int[] {fib[1], fib[0] + fib[1]}).limit(n).forEach(fib -> System.out.print(fib[0] + " "));

	}

}
