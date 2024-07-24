package Interview;

import java.util.List;

public class NamesOfDepartments {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		empList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

	}

}
