package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsArrayUsingStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 2);
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> duplicate = list.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
		System.out.println(set);
		System.out.println(duplicate);

	}

}
