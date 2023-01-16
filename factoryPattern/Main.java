package factoryPattern;

public class Main {

	public static void main(String[] args) {
		HR marketingHR=new MarketingHR();
		Employee marketingEmployee=marketingHR.hireEmployee();
		marketingEmployee.terminateEmployee();

	}

}
