package Interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class YoungerOrOlderThan30 {

	public static void main(String[] args) {
		
		List<Employee> empList = EmployeeData.getEmployeeData();
		
		Map<Boolean, List<Employee>> out = empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() <= 30));
		
		out.forEach((k, v) -> {
			if(!k) {
				System.out.println("Employee Less than or equal to 30");
				for(Employee e : v) {
					System.out.println("Age" + " " + e.getAge() + "-" + e.getName());
				}
			} else {
				System.out.println("Employee Greater than 30");
				for(Employee e : v) {
					System.out.println("Age" + " " + e.getAge() + "-" + e.getName());
				}
			}
		});
		
//		System.out.println(out);

	}

}
