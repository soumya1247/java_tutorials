package Interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEmployeesEachDepartment {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Map<String, Long> out = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		out.forEach((k, v) -> {
			
			System.out.println(k + "-> " + v);
		});

	}

}
