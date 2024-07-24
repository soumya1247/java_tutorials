package Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FinalOutput {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();

		personList.add(new Person("A", 15));
		personList.add(new Person("B", 30));
		personList.add(new Person("C", 15));
		personList.add(new Person("D", 30));
		
		List<Person> sortedPersonList = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		
		sortedPersonList.forEach(p -> System.out.println(p.getName() + ":" + p.getAge()));
	}

}
