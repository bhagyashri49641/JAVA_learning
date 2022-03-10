package infy.com.aggregation_practice;

public class Tester {

	public static void main(String[] args) {
		Address address = new Address("5","Ausa Road", "Latur", 413512);
		
		Customer customer = new Customer("P1","Shree", 250560 , address);
		customer.displayCustomerDetails();
	}

}
