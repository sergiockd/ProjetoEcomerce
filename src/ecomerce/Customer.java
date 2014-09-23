package ecomerce;

public class Customer {
	private String firstName;
	private String emailAddress;
	private String lastName;
	private int customerType;
	private double discount;
	private int idCustomer ;
	private int idAccountFK;
	
	
	
	public int getIdAccountFK() {
		return idAccountFK;
	}
	public void setIdAccountFK(int idAccountFK) {
		this.idAccountFK = idAccountFK;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getCustomerType() {
		return customerType;
	}
	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public int getIdcustomer (){
		return idCustomer ;
	}
	
	public void setIdcustomer(int idCustomer){
		this.idCustomer = idCustomer ;
	}
	
}
