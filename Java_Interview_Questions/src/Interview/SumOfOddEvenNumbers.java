package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfOddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 2);
		Map<Boolean, Integer> map = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.summingInt(Integer::intValue)));
		System.out.println(map);

	}

}
