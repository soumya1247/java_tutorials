package Interview;

@FunctionalInterface
interface MathOperation {
	public int calculate(int a, int b);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		int s = addition.calculate(4, 5);
		System.out.println(s);

	}

}
