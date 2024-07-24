package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		Set<String> check = new HashSet<String>();
		String[] arr = "java  tutorial".replaceAll("\\s+", "").toLowerCase().split("");
		List<String> list = Arrays.asList(arr);
		
		Optional<String> out = list.stream().filter(s -> !check.add(s)).findFirst();
		System.out.println(out.get());
		System.out.println(check);

	}

}
