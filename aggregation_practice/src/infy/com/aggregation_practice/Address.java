package infy.com.aggregation_practice;

public class Address {
	private String doorno;
	private String street;
	private String city;
	private int zipcode;
	
	//getters and setters
	public String getDoorno() {
	return doorno;
	}
	public void setDoorno(String doorno) {
	this.doorno = doorno;
	}
	
	public String getStreet() {
	return street;
	}
	public void setStreet(String street) {
	this.street = street;
	}
	
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	
	public int getPincode() {
	return zipcode;
	}
	public void setPincode(int zipcode) {
	this.zipcode = zipcode;
	}
	
	//Parameterized constructor
	Address(String doorno,String street,String city,int zipcode)
	{
	this.doorno = doorno;
	this.street = street;
	this.city = city;
	this.zipcode = zipcode;
	}
	
	

}
