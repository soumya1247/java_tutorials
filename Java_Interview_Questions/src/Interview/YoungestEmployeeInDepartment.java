package Interview;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class YoungestEmployeeInDepartment {

	public static void main(String[] args) {

		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Optional<Employee> youngestInOrg = empList.stream().min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngestInOrg.get().getName());
		
		Optional<Employee> youngestInHR = empList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales")).min(Comparator.comparingInt(Employee::getAge));
		System.out.println(youngestInHR.get().getName());
		
		Optional<Employee> oldestInOrg = empList.stream().max(Comparator.comparingInt(Employee::getAge));
		System.out.println(oldestInOrg.get().getName());

		//Highest Paid Employee
		Optional<Employee> y = empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		System.out.println(y.get().getName());

	}

}
