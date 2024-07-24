package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FreqEachCharacter {

	public static void main(String[] args) {
		
		String input = "java programming language";
		String[] str = input.replaceAll("\\s+", "").toLowerCase().split("");
		List<String> list = Arrays.asList(str);
		Map<String , Long> map = list.stream().collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
		System.out.println(map);

	}

}
