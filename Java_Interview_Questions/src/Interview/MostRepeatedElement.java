package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MostRepeatedElement {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("A", "A", "A", "AAA", "AAA");
		Map<String, Long> mp = list.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
		Entry<String, Long> result = mp.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(result.getKey() + "->" + result.getValue());

	}

}
