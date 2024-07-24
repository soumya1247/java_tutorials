package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "mango");
		
//		Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
		Predicate<? super String> predicate = fruit -> fruit.startsWith("c");
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
//		System.out.println(optional.get());
		System.out.println(optional.isEmpty() ? "GG" : optional.get());
		
		Optional<String> fruit = Optional.of("guava");
		Optional<String> empty = Optional.empty();
	}
}
