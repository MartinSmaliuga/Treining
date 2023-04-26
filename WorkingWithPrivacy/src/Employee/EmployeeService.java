package Employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

import Employee.Manager.Manager;

public class EmployeeService {
	
	public static void main (String... args) {
		Employee[] employees = new Employee[13];
		
		for (int n, i = 0; i < employees.length; i++) {
			n = (int) Math.round(Math.random());
			employees[i] = n == 0 ? new Employee() : new Manager();
			
		}
		
		for (Employee emp : employees) {
			emp.process();
			
		}
		
	}

}
