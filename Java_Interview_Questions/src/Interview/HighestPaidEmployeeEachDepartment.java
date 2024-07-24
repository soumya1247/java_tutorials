package Interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeeEachDepartment {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Map<String, List<Employee>> out = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		out.forEach((k, v) -> {
			Optional<Employee> e = v.stream().max(Comparator.comparingDouble(Employee::getSalary));
			System.out.println(k + "-> " + e.get().getName());
		});
	}

}
