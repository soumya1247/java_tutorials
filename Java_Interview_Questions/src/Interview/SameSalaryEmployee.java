package Interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SameSalaryEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Map<Double, List<Employee>> out = empList.stream().collect(Collectors.groupingBy(Employee::getSalary));
		
		out.forEach((k, v) -> {
			System.out.println(k + "->");
			String str = "";
			for (Employee e : v) {
				
				str +=  e.getName() + " ,";
			}
			System.out.println(str);
				});

	}

}
