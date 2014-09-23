package ecomerce;

public class Account {
	
	private int idAccount;
	private String userName;
	private String password;
	private Customer customer;
	private Billinginfo billingInfo;
	private ShippingInfo shippingInfo;

	public String getUserName() {
		return userName;

	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {

		this.customer = customer;

	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public Billinginfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(Billinginfo billingInfo) {
		this.billingInfo = billingInfo;
	}

	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
}
