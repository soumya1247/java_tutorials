package Interview;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	public static List<Employee> getEmployeeData() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(101, "A", 22, "Male", "HR", 2011, 20100.0));
		employeeList.add(new Employee(102, "B", 32, "Male", "Sales", 2015, 20300.0));
		employeeList.add(new Employee(103, "C", 22, "Female", "Infra", 2001, 20400.0));
		employeeList.add(new Employee(104, "D", 32, "Male", "Product", 2012, 20500.0));
		employeeList.add(new Employee(105, "E", 22, "Female", "HR", 2009, 20200.0));
		employeeList.add(new Employee(106, "F", 42, "Male", "Sales", 2014, 20100.0));
		employeeList.add(new Employee(107, "G", 41, "Female", "HR", 2008, 20500.0));
		employeeList.add(new Employee(108, "H", 22, "Female", "Sales", 2003, 20400.0));
		employeeList.add(new Employee(109, "I", 43, "Male", "Product", 2017, 20100.0));
		employeeList.add(new Employee(110, "J", 22, "Male", "HR", 2014, 20400.0));
		
		return employeeList;
	}
}
