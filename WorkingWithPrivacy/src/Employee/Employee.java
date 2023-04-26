package Employee;

import java.time.LocalDate;
import java.time.Month;

public class Employee {
	private static Integer employeesAmount = 0;
	private final Integer empId;
	private /*final*/ LocalDate dateOfBirth /*= LocalDate.of(2023, Month.APRIL, 25)*/;
	private String firstName;
	private String lastName;
	
	public Employee(String firstName,
					String lastName,
					LocalDate dateOfBirth) {
		
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		
		empId = ++employeesAmount;
		
	}
	
	public Employee() {
		this("Someone",
			 "Someone",
			 LocalDate.of(0, employeesAmount%12+1, 1));
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Integer getEmployeeId() {
		return empId;
	}
	
	public static Integer getEmployeesAmount() {
		return employeesAmount;
	}
	
	public void process() {
		System.out.println("\nFirst name: " + firstName
				         + "\nLast name: " + lastName
						 + "\nDate of birth: " + dateOfBirth
						 + "\nId: " + empId);
		
	}
	
}
