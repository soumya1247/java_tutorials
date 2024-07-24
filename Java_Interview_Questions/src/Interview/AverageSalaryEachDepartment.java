package Interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryEachDepartment {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Map<String, Double> out = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		out.forEach((k, v) -> {
			
			System.out.println(k + "-> " + v);
		});
	}

}
