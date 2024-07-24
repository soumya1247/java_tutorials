package Interview;

import java.util.Arrays;
import java.util.List;

public class WordsStartingWithNumbers {

	public static void main(String[] args) {
		
		String[] str = {"one", "two", "3ree", "4our"};
		List<String> strArr = Arrays.asList(str);

		strArr.stream().filter(s -> Character.isDigit(s.charAt(0))).forEach(System.out::println);
	}

}
