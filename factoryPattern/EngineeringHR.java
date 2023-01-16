package factoryPattern;

public class EngineeringHR extends HR {

	public Employee hireEmployee() {
		Employee employee=new EngineeringEmployee();
		System.out.println("New engineering employee hired.");
		return employee;
	}
}
