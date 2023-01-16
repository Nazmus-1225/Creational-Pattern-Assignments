package factoryPattern;

public class MarketingHR extends HR {

	@Override
	public Employee hireEmployee() {
		Employee employee=new MarketingEmployee();
		System.out.println("New marketing employee hired.");
		return employee;
	}

}
