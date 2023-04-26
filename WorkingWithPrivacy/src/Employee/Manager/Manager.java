package Employee.Manager;

import java.time.LocalDate;

import Employee.Employee;

public class Manager extends Employee{
	private static Integer managersAmount = 0;
	private final Integer mngId;
	
	public Manager(String firstName,
				   String lastName,
				   LocalDate dateOfBirth) {
		super(firstName, lastName, dateOfBirth);
		mngId = ++managersAmount;
		
	}
	
	public Manager() {
		super();
		mngId = ++managersAmount;
		
	}
	
	public Integer getManagerId() {
		return mngId;
	}
	
	public static Integer getManagersAmount() {
		return managersAmount;
	}
	
	@Override
	public void process () {
		super.process();
		System.out.println("Manager Id: " + mngId);
		
	}
	
}
