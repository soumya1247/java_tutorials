package Interview;

import java.util.List;

public class EmployeesBeforeSomeYear {

	public static void main(String[] args) {

		List<Employee> empList = EmployeeData.getEmployeeData();
		
		empList.stream().filter(e -> e.getYearOfJoining() < 2014).forEach(e -> System.out.println(e.getName()));

	}

}
