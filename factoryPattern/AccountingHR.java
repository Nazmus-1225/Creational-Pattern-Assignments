package factoryPattern;

public class AccountingHR extends HR {

	public Employee hireEmployee() {
		Employee employee=new AccountingEmployee();
		System.out.println("New accounting employee hired.");
		return employee;
	}
}
