package Interview;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employee2ndMostExperience {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Optional<Employee> mostExp = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).skip(1).findFirst();
		
		System.out.print(mostExp.get());
	} 

}
