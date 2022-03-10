package infy.com.aggregation_practice;

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNum;
	private Address address;
	
	//getters and setters for all private members of Customer class
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// constructors
	//default constructor
	Customer(){					
		this.customerId = null;
		this.customerName = null;
		this.contactNum = 0;
		this.address =null;
	}
	
	//Parameterized constructor
	Customer(String customerId, String customerName, long contactNum, Address address){
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNum = contactNum;
		this.address = address;
		
	}
	
	//Parameterized constructor
	Customer(String customerName, long contactNum, Address address){
		this.customerId = null;
		this.customerName = customerName;
		this.contactNum = contactNum;
		this.address = address;
	}	
	
	public void displayCustomerDetails()
	{
		System.out.println("customerId      : " + this.customerId);
		System.out.println("customerName 	: " + this.customerName);
		System.out.println("contactNum      : " + this.contactNum);
		System.out.println("address         : "  + address.getDoorno() +", "+ address.getStreet()+", "+ address.getCity()+", "+ address.getPincode()+"\n");
	}
	/*
	public double payBill(double totalPrice)
	{
		
		return totalBill;
	}*/

}

