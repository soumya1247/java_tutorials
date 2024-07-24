package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words_Starting_With_Vowels {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "boy", "eagle", "OOO");
		
		List<String> vowels = words.stream().map(String::toLowerCase).filter(w -> w.charAt(0) == 'a' || w.charAt(0) == 'e' || w.charAt(0) == 'i' || w.charAt(0) == 'o' || w.charAt(0) == 'u').collect(Collectors.toList());
		
		System.out.println(vowels);
				
	}

}
