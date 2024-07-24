package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsBasedOnLength {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "AA", "AAAA", "AAA");
		list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

	}

}
